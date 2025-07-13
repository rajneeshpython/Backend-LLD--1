package SolidPrinciples.ocp;

public class ManagerSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        double tax = 0.20;
        return employee.getSalary() * (1 + tax);
    }
}
