package SolidPrinciples.lsp;

public class ManagerSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        double tax = 0.15;
        return employee.getSalary() * (1 - tax);
    }
}
