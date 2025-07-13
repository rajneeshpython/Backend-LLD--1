package SolidPrinciples.isp.basic;

public class FullTimeEmployee implements LeaveApprover, SalaryCalculable, HRActionable {
    @Override
    public void fireEmployee(Employee employee) {
        System.out.println("Employee " + employee.getName() + " has been fired.");
    }

    @Override
    public void approveLeave(Employee employee) {
        System.out.println("Leave approved for : " + employee.getName());
    }

    @Override
    public void calculateSalary(Employee employee) {
        System.out.println("Salary for full-time employee " + employee.getName() + " has been calculated.");

    }
}
