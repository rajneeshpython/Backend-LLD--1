package SolidPrinciples.ocp;

public class DeveloperSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        double tax = 0.10;
        return employee.getSalary() * (1 - tax);
    }
}
