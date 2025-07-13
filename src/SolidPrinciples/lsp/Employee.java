package SolidPrinciples.lsp;

public class Employee {
    private String name;
    private double salary;
    private EmployeeRole role;

    public Employee(String name, double salary, EmployeeRole role) {
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public EmployeeRole getRole() {
        return role;
    }
}
