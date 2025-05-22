package LibraryManagement;

public class Librarian extends User{
    private String employeeNumber;

    Librarian() {
        super();
        this.employeeNumber = "";
    }

    Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    Librarian(Librarian other) {
        super(other);
        this.employeeNumber = other.employeeNumber;
    }

    @Override
    void displayDashboard() {
        System.out.println("LibraryManagement.Librarian Dashboard");
        System.out.printf("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book){
        System.out.println("Adding new book:");
    }
    void removeBook(Book book){
        System.out.println("Removing book:");
    }

}
