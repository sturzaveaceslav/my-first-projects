package company.employees;

public class Freelancer extends company.employees.Employee {
    private int projectsCompleted;
    private double payPerProject;

    public Freelancer(String name, int projectsCompleted, double payPerProject) {
        super(name);
        this.projectsCompleted = projectsCompleted;
        this.payPerProject = payPerProject;
    }

    @Override
    public double calculateSalary() {
        return projectsCompleted * payPerProject;
    }
}
