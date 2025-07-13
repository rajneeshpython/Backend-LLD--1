package SolidPrinciples.isp.basic;

public class ContractEmployee implements SalaryCalculable{

    @Override
    public void calculateSalary(Employee employee) {
        System.out.println("Salary for contract employee " + employee.getName() + " has been calculated.");
    }
}
