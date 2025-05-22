package LibraryManagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory ;
    List<User> registeredUsers ;

    public LibraryManagementSystem(){
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book){
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public void displayAllBooks(){
        for(Book book : bookInventory){
            book.displayBookDetails();
        }
    }

    public void displayRegisteredUsers(){
        for(User user : registeredUsers){
            user.displayDashboard();
        }
    }

    public List<Book> searchBooks(String criteria){
        List<Book> resultantBooks = new ArrayList<>();
        criteria = criteria.toLowerCase();
        for(Book book : bookInventory){
            if(book.getTitle().toLowerCase().contains(criteria)
                    || book.getAuthor().toLowerCase().contains(criteria)){
                resultantBooks.add(book);
            }
        }
        return resultantBooks;
    }

    public List<Book>searchBooks(String criteria, BookType type){
        List<Book> resultantBooks = new ArrayList<>();
        criteria = criteria.toLowerCase();
        for(Book book : bookInventory){
            if(book.getTitle().toLowerCase().contains(criteria)
                    || book.getAuthor().toLowerCase().contains(criteria)
                    && book.getType() == type){
                resultantBooks.add(book);
            }
        }
        return resultantBooks;
    }
}
