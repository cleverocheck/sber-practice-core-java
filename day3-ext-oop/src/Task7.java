import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new FullTimeEmployee(1, "Ivan", "Dev", 1000));
        company.addEmployee(new PartTimeEmployee(2, "Anna", "QA", 1000, 20));
        company.addEmployee(new Manager(3, "Bob", "Lead", 2000, 500));
        company.addEmployee(new Intern(4, "Tom", "Intern", 300));

        System.out.println(company.calculateTotalSalaries());
        System.out.println(company.getEmployeesByPosition("Intern"));
    }
}

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

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, String position, double baseSalary) {
        super(id, name, position, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

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

class Company {
    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalSalaries() {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.calculateSalary();
        }
        return sum;
    }

    public ArrayList<Employee> getEmployeesByPosition(String position) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getPosition().equals(position)) {
                result.add(e);
            }
        }
        return result;
    }
}