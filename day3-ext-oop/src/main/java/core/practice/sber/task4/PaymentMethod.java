package core.practice.sber.task4;

abstract class PaymentMethod {
    private String ownerName;

    public PaymentMethod(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract boolean pay(double amount);
}
