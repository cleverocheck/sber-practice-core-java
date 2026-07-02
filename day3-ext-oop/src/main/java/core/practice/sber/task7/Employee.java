package core.practice.sber.task7;

abstract class Employee {
    private final int id;
    private final String name;
    private final String position;
    private final double baseSalary;

    public Employee(int id, String name, String position, double baseSalary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();
}