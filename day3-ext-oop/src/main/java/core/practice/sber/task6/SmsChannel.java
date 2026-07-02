package core.practice.sber.task6;

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