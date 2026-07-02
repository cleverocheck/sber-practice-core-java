package core.practice.sber.task4;


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