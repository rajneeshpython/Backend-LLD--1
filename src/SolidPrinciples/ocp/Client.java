package SolidPrinciples.ocp;

public class Client{
    public static void main(String[] args) {
        Employee employee = new Employee("John", EmployeeRole.DEVELOPER, 10000);
        Employee employee1 = new Employee("Mary", EmployeeRole.MANAGER, 20000);
        Employee employee2 = new Employee("Mike", EmployeeRole.INTERN, 5000);

       EmpDAO empDAO = new EmpDAO();
       empDAO.insertEmployee(employee);
       empDAO.insertEmployee(employee1);
       empDAO.insertEmployee(employee2);

       SalaryCalculator calculator = SalaryCalculatorFactory.getCalculator(employee.getRole());
       System.out.println("Salary of " + employee.getName() + " is " + calculator.calculateSalary(employee));
       SalaryCalculator calculator1 = SalaryCalculatorFactory.getCalculator(employee1.getRole());
       System.out.println("Salary of " + employee1.getName() + " is " + calculator1.calculateSalary(employee1));
       SalaryCalculator calculator2 = SalaryCalculatorFactory.getCalculator(employee2.getRole());
       System.out.println("Salary of " + employee2.getName() + " is " + calculator2.calculateSalary(employee2));
    }
}