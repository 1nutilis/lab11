public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable = true;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void markAsLoaned() {
        isAvailable = false;
    }

    public void markAsAvailable() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
