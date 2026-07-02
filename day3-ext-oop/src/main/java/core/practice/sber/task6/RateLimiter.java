package core.practice.sber.task6;

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