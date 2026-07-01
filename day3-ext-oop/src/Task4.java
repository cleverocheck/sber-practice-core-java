import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod method1 = new PayPal("user@mail.com");
        PaymentMethod method2 = new CreditCard("Ivan", "1111", "12/30", "123");
        PaymentMethod method3 = new CryptoWallet("Bob", "wallet123");

        System.out.println(processor.processPayment(method1, 50000));
        System.out.println(processor.processPayment(method2, 60000));
        System.out.println(processor.processPayment(method3, 200000));
    }
}

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

class CryptoWallet extends PaymentMethod {
    private String walletAddress;

    public CryptoWallet(String ownerName, String walletAddress) {
        super(ownerName);
        this.walletAddress = walletAddress;
    }

    public boolean pay(double amount) {
        return amount * 1.015 <= 500000;
    }
}

class PaymentProcessor {
    public boolean processPayment(PaymentMethod method, double amount) {
        return method.pay(amount);
    }
}