package company.employees;

public class Main {
    public static void main(String[] args) {
        company.employees.Employee[] employees = {
                new company.employees.FullTimeEmployee("Slavon", 4000),
                new company.employees.PartTimeEmployee("Matei", 80, 25),
                new company.employees.Freelancer("Ion", 5, 500)
        };

        for (company.employees.Employee emp : employees) {
            System.out.println(emp.getName() + " → Salariu: " + emp.calculateSalary() + " EUR");
        }
    }
}
