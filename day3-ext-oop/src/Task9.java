import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();

        Vehicle car = new Car("BMW", "X5", 2020, 50000, 4);
        Vehicle truck = new Truck("Volvo", "FH", 2021, 80000, 2, 10000);

        dealer.addVehicle(car);
        dealer.addVehicle(truck);

        dealer.sellVehicle(car);

        System.out.println("Total: " + dealer.getTotalInventoryValue());

        ArrayList<Vehicle> trucks = dealer.filterByType("truck");
        System.out.println("Trucks: " + trucks.size());
    }
}

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

class Car extends Vehicle {
    private final int doorCount;

    public Car(String make, String model, int year, double price, int doorCount) {
        super(make, model, year, price);
        this.doorCount = doorCount;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запущен: " + getMake() + " " + getModel());
    }

    @Override
    public String getVehicleType() {
        return "car";
    }
}

class Truck extends Car {
    private final double cargoCapacity;

    public Truck(String make, String model, int year, double price, int doorCount, double cargoCapacity) {
        super(make, model, year, price, doorCount);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getVehicleType() {
        return "truck";
    }
}

class Motorcycle extends Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String make, String model, int year, double price, boolean hasSidecar) {
        super(make, model, year, price);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запущен: мотоцикл " + getMake() + " " + getModel());
    }

    @Override
    public String getVehicleType() {
        return "motorcycle";
    }
}

interface Electrifiable {
    void chargeBattery();
}

class ElectricCar extends Car implements Electrifiable {
    public ElectricCar(String make, String model, int year, double price, int doorCount) {
        super(make, model, year, price, doorCount);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging...");
    }
}

class CarDealer {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public double getTotalInventoryValue() {
        double sum = 0;
        for (Vehicle v : vehicles) {
            sum += v.getPrice();
        }
        return sum;
    }

    public ArrayList<Vehicle> filterByType(String type) {
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equals(type)) {
                result.add(v);
            }
        }
        return result;
    }
}