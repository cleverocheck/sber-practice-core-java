package core.practice.sber.task9;

import java.util.ArrayList;

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