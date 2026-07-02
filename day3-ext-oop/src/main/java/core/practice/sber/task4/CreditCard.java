package core.practice.sber.task4;

class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCard(String ownerName, String cardNumber, String expiryDate, String cvv) {
        super(ownerName);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public boolean pay(double amount) {
        return amount <= 50000;
    }
}
