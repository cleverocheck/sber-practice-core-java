import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.addChannel(new EmailChannel());
        service.addChannel(new SmsChannel());
        service.addChannel(new PushChannel());

        for (int i = 0; i < 15; i++) {
            service.notifyAll("msg " + i);
        }
    }
}

abstract class NotificationChannel {
    private boolean isEnabled = true;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public abstract void send(String message);

    public abstract String getChannelName();
}

interface RateLimitable {
    int getMaxMessagesPerMinute();

    boolean tryAcquire();
}

class RateLimiter {
    private long windowStart = System.currentTimeMillis();
    private int count = 0;

    public boolean allow(int limit) {
        long now = System.currentTimeMillis();

        if (now - windowStart >= 60000) {
            windowStart = now;
            count = 0;
        }

        if (count < limit) {
            count++;
            return true;
        }

        return false;
    }
}

class EmailChannel extends NotificationChannel implements RateLimitable {
    private final RateLimiter limiter = new RateLimiter();

    @Override
    public int getMaxMessagesPerMinute() {
        return 60;
    }

    @Override
    public boolean tryAcquire() {
        return limiter.allow(getMaxMessagesPerMinute());
    }

    @Override
    public void send(String message) {
        System.out.println("EMAIL: " + message);
    }

    @Override
    public String getChannelName() {
        return "EmailChannel";
    }
}

class SmsChannel extends NotificationChannel implements RateLimitable {
    private final RateLimiter limiter = new RateLimiter();

    @Override
    public int getMaxMessagesPerMinute() {
        return 10;
    }

    @Override
    public boolean tryAcquire() {
        return limiter.allow(getMaxMessagesPerMinute());
    }

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }

    @Override
    public String getChannelName() {
        return "SmsChannel";
    }
}

class PushChannel extends NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("PUSH: " + message);
    }

    @Override
    public String getChannelName() {
        return "PushChannel";
    }
}

class NotificationService {
    private final List<NotificationChannel> channels = new ArrayList<>();

    public void addChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    public void notifyAll(String message) {
        for (NotificationChannel channel : channels) {

            if (!channel.isEnabled()) continue;

            if (channel instanceof RateLimitable rateLimitable) {
                if (rateLimitable.tryAcquire()) {
                    channel.send(message);
                }
            } else {
                channel.send(message);
            }
        }
    }
}