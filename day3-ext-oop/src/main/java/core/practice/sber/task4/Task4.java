package core.practice.sber.task4;

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
