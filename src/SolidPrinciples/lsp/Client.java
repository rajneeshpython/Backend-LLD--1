package SolidPrinciples.lsp;

public class Client {
    public static void main(String[] args) {
        Employee developer = new Employee("John", 10000, EmployeeRole.DEVELOPER);
        Employee manager = new Employee("Mary", 20000, EmployeeRole.MANAGER);

        DeveloperSalaryCalculator developerSalaryCalculator = new DeveloperSalaryCalculator();
        ManagerSalaryCalculator managerSalaryCalculator = new ManagerSalaryCalculator();

        SalaryService salaryService = new SalaryService();
        double developerNetSalary = salaryService.processSalary(developer, developerSalaryCalculator);
        double managerNetSalary = salaryService.processSalary(manager, managerSalaryCalculator);

        System.out.println("Developer salary is " + developerNetSalary);
        System.out.println("Manager salary is " + managerNetSalary);

    }
}
