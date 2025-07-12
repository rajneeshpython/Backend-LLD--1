package SolidPrinciples.OCP;

public class Employee {
    private String name;
    private EmployeeRole role;
    private double salary;

    public Employee(String name, EmployeeRole role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public EmployeeRole getRole(){
        return role;
    }
    public double getSalary(){
        return salary;
    }
}
