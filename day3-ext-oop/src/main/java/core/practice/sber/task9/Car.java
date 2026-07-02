package core.practice.sber.task9;

class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, double price, int doors) {
        super(make, model, year, price);
        this.doors = doors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public String getVehicleType() {
        return "car";
    }
}