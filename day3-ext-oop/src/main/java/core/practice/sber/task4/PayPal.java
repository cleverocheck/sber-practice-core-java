package core.practice.sber.task4;

class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String ownerName) {
        super(ownerName);
        this.email = ownerName;
    }

    public boolean pay(double amount) {
        return amount <= 100000;
    }
}