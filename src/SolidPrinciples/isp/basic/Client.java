package SolidPrinciples.isp.basic;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rajneesh", EmployeeRole.FULL_TIME);
        Employee e2 = new Employee("Rahul", EmployeeRole.CONTRACT);

        FullTimeEmployee fullTime = new FullTimeEmployee();
        ContractEmployee contract = new ContractEmployee();

        fullTime.approveLeave(e1);
        fullTime.fireEmployee(e1);
        fullTime.calculateSalary(e1);

        contract.calculateSalary(e2);
        // contract.approveLeave(e2); wrong access not possible
    }
}
