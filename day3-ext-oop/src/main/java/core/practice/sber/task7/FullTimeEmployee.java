package core.practice.sber.task7;

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, String position, double baseSalary) {
        super(id, name, position, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}