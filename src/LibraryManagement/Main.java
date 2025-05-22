package LibraryManagement;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = getLibraryManagementSystem();

        // Display books and users
        System.out.println("--- Displaying All Books ---");
        lms.displayAllBooks();
        System.out.println("--- Displaying Registered Users ---");
        lms.displayRegisteredUsers();

        // Test searchBooks(criteria)
        System.out.println("--- Testing searchBooks(\"data\") ---");
        List<Book> dataResults = lms.searchBooks("data");
        for (Book b : dataResults) {
            b.displayBookDetails();
        }

        // Test searchBooks(criteria, className)
        System.out.println("--- Testing searchBooks(\"computer\", \"LibraryManagement.TextBook\") ---");
        List<Book> csTextBooks = lms.searchBooks("computer", BookType.Textbook);
        for (Book b : csTextBooks) {
            b.displayBookDetails();
        }

        System.out.println("--- Testing searchBooks(\"Adventure\", \"LibraryManagement.NovelBook\") ---");
        List<Book> adventureNovels = lms.searchBooks("Adventure", BookType.NovelBook);
        for (Book b : adventureNovels) {
            b.displayBookDetails();
        }

        // Test empty result
        System.out.println("--- Testing searchBooks(\"Python\") with no matches ---");
        List<Book> noMatches = lms.searchBooks("Python");
        if (noMatches.isEmpty()) {
            System.out.println("No books found matching 'Python'.");
        } else {
            System.out.println("The following books matched 'Python':");
            for (Book b : noMatches) {
                b.displayBookDetails();
            }
        }
    }

    private static LibraryManagementSystem getLibraryManagementSystem() {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        // Create and add books
        TextBook tb1 = new TextBook("111", "Java Programming", "Raj", "Computer Science", BookType.Textbook,1);
        NovelBook nb1 = new NovelBook("222", "The Great Adventure", "Anna Smith",BookType.NovelBook, "Adventure");
        TextBook tb2 = new TextBook("333", "Data Structures", "Ravi", "Computer Science",BookType.Textbook, 2);
        TextBook tb3 = new TextBook("333", "Python", "Rajneesh kr.", "Computer Science",BookType.Textbook, 2);

        lms.addBook(tb1);
        lms.addBook(nb1);
        lms.addBook(tb2);
        lms.addBook(tb3);

        // Create and register users
        Member m1 = new Member("John Doe", "john@example.com");
        Librarian l1 = new Librarian("Lisa Ray", "lisa@example.com", "EMP001");
        lms.registerUser(m1);
        lms.registerUser(l1);
        return lms;
    }
}
