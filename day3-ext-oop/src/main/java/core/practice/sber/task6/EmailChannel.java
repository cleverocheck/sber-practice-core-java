package core.practice.sber.task6;

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