package LibraryManagement;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;
    private BookType type;

    Book(){
        this.isAvailable = true;
    }

    Book(String isbn, String title, String author, BookType type) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.type = type;
    }

    Book(Book book){
        this.isbn = book.isbn;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = true;
        this.type = book.type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            System.out.println("LibraryManagement.Book '" + title + "' lent to " + user.getName());
            return true;
        }
        System.out.println("LibraryManagement.Book not available or user can't borrow.");
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        System.out.println("LibraryManagement.Book '" + title + "' returned by " + user.getName());

    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    abstract void displayBookDetails();
}
