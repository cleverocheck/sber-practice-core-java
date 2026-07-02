package core.practice.sber.task6;

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