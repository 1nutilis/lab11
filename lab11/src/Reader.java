public class Reader {
    private int id;
    private String name;
    private String email;

    public Reader(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.markAsLoaned();
            System.out.println(name + " borrowed " + book);
        } else {
            System.out.println("Book is already loaned.");
        }
    }

    public void returnBook(Book book) {
        book.markAsAvailable();
        System.out.println(name + " returned " + book);
    }
}
