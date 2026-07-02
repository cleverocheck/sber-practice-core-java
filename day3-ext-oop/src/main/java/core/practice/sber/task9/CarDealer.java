package core.practice.sber.task9;

import java.util.ArrayList;

class CarDealer {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public double getTotalInventoryValue() {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.getPrice();
        }
        return total;
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