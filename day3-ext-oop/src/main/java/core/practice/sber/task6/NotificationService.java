package core.practice.sber.task6;

import java.util.ArrayList;
import java.util.List;

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