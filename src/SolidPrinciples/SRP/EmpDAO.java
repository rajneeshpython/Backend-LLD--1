package SolidPrinciples.SRP;

public class EmpDAO {
    DatabaseConnection dbConnection;

    public EmpDAO() {
        dbConnection = new DatabaseConnection();
    }

    public void insertEmployee(Employee employee){
        dbConnection.connect();
        System.out.println("Employee inserted with following details");
        System.out.println("Name : " + employee.getName());
        System.out.println("Role : " + employee.getRole());
        System.out.println("Salary : " + employee.getSalary());
        dbConnection.disconnect();
    }

   public void updateEmployee(Employee employee){
        dbConnection.connect();
        System.out.println("Employee updated with following details");
        System.out.println("Name : " + employee.getName());
        System.out.println("Role : " + employee.getRole());
        System.out.println("Salary : " + employee.getSalary());
   }
   public void deleteEmployee(Employee employee){
        dbConnection.connect();
        System.out.println("Employee deleted with following details");
        System.out.println("Name : " + employee.getName());
   }
}
