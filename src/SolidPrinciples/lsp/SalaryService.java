package SolidPrinciples.lsp;

public class SalaryService {
    public double processSalary(Employee employee, SalaryCalculator calculator){
        return calculator.calculateSalary(employee);
    }
}
