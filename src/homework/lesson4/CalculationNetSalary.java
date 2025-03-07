package homework.lesson4;

public class CalculationNetSalary {
    public static void main(String[] args) {
        String employeeName;
        double salary = 35450;
        double salaryNet;
        double salaryTotal;

        employeeName = "Victor";

        salaryNet = salary * 0.2;
        salaryTotal = salary - salaryNet;
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary + " mdl");
        System.out.println("Income tax: " + salaryNet + " mdl");
        System.out.println("Salary on card: " + salaryTotal + " mdl");


    }
}
