package LibraryManagement;

public class TextBook extends Book{
    private String subject;
    private int edition;

    TextBook() {
        super();
        this.subject = "";
        this.edition = 0;
    }

    TextBook(String  isbn, String title,String auther, String subject, BookType type, int edition) {
        super(isbn, title, auther, type);
        this.subject = subject;
        this.edition = edition;
    }

    TextBook(TextBook other) {
        super(other);
        this.subject = other.subject;
        this.edition = other.edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {
        System.out.println( "Text LibraryManagement.Book Details");
        System.out.println( "ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Auther: " + getAuthor());
        System.out.println("Subject: " + getSubject());
        System.out.println("Edition: " + getEdition());
    }
}
