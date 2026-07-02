package core.practice.sber.task9;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        int current = java.time.Year.now().getValue();
        if (year < 1900 || year > current + 1)
            throw new IllegalArgumentException();
        this.year = year;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException();
        this.price = price;
    }

    public abstract void startEngine();

    public abstract String getVehicleType();
}