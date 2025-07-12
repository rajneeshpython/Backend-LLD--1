package SolidPrinciples.OCP;

public class InterSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        double tax = 0.05;
        return employee.getSalary() * (1 + tax);
    }
}
