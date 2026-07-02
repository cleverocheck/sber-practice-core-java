package core.practice.sber.task7;

class PartTimeEmployee extends Employee {
    private final int hoursWorked;

    public PartTimeEmployee(int id, String name, String position, double baseSalary, int hoursWorked) {
        super(id, name, position, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked / 40.0;
    }
}