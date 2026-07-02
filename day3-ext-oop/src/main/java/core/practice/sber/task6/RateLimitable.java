package core.practice.sber.task6;

interface RateLimitable {
    int getMaxMessagesPerMinute();

    boolean tryAcquire();
}