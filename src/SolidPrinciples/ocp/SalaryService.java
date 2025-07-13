package SolidPrinciples.ocp;

public class SalaryService {
    public double calculateSalary(Employee employee, SalaryCalculator calculator){
        SalaryCalculator salaryCalculator = SalaryCalculatorFactory.getCalculator(employee.getRole());
        return salaryCalculator.calculateSalary(employee);
    }

}
