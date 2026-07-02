package core.practice.sber.task6;

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