package core.practice.sber.task7;

class Manager extends FullTimeEmployee {
    private final double bonus;

    public Manager(int id, String name, String position, double baseSalary, double bonus) {
        super(id, name, position, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}