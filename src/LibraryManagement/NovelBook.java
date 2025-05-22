package LibraryManagement;

public class NovelBook extends Book {
    private String genre;

    NovelBook() {
        super();
        this.genre = "";
    }

    NovelBook(String isbn, String title, String auther,BookType type ,String genre) {
        super(isbn, title, auther, type);
        this.genre = genre;
    }

    NovelBook(NovelBook other) {
        super(other);
        this.genre = other.genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Novel LibraryManagement.Book Details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Auther: " + getAuthor());
        System.out.println("Genre: " + getGenre());
    }
}
