package SolidPrinciples.SRP;

public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("John", EmployeeRole.DEVELOPER, 10000);
        Employee employee1 = new Employee("Mary", EmployeeRole.MANAGER, 20000);
        Employee employee2 = new Employee("Mike", EmployeeRole.INTERN, 5000);

        EmpDAO empDAO = new EmpDAO();
        empDAO.insertEmployee(employee);
        empDAO.insertEmployee(employee1);
        empDAO.insertEmployee(employee2);

        SalaryService salaryService = new SalaryService();
        System.out.println("Salary of " + employee.getName() + " is " + salaryService.calculateSalary(employee));
        System.out.println("Salary of " + employee1.getName() + " is " + salaryService.calculateSalary(employee1));
        System.out.println("Salary of " + employee2.getName() + " is " + salaryService.calculateSalary(employee2));
    }
}
