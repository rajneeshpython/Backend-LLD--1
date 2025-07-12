package SolidPrinciples.SRP;

public class SalaryService {

    public double calculateSalary(Employee employee){
        SalaryCalculator calculator;
        if(employee.getRole() == EmployeeRole.MANAGER){
            calculator = new ManagerSalaryCalculator();
        }
        else{
            calculator = new NormalSalaryCalculator();
        }

        return calculator.calculateSalary(employee);
    }
}
