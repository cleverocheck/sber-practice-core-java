package core.practice.sber.task7;

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