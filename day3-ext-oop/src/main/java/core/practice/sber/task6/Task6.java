package core.practice.sber.task6;

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