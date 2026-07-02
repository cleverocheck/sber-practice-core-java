package core.practice.sber.task7;

import java.util.ArrayList;

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