package core.practice.sber.task7;

class Intern extends Employee {
    private final double stipend;

    public Intern(int id, String name, String position, double stipend) {
        super(id, name, position, 0);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}