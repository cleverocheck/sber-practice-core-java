package core.practice.sber.task4;

class PaymentProcessor {
    public boolean processPayment(PaymentMethod method, double amount) {
        return method.pay(amount);
    }
}