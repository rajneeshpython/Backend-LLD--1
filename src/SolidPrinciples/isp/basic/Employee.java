package SolidPrinciples.isp.basic;

public class Employee {
    private String name;
    private EmployeeRole role;

    public Employee(String name, EmployeeRole role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public EmployeeRole getRole() {
        return role;
    }
}
