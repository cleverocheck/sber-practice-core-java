package core.practice.sber.task9;

class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String make, String model, int year, double price, int doors, int cargoCapacity) {
        super(make, model, year, price);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }

    @Override
    public String getVehicleType() {
        return "truck";
    }
}