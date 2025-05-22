package LibraryManagement;

public class Member extends User{
    private int borrowedBooksCount;
    public static final int MAX_BORROW_LIMIT = 5;

    Member() {
        super();
        this.borrowedBooksCount = 0;
    }

    Member(String name, String contactInfo) {
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    Member(Member other) {
        super(other);
        this.borrowedBooksCount = 0;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    void displayDashboard() {
        System.out.println("LibraryManagement.Member Dashboard");
        System.out.printf("Name: " + getName());
        System.out.println("Books Borrowed: " + borrowedBooksCount);

    }

    @Override
    boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
