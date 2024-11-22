import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", "123456789");
        Book book2 = new Book("Brave New World", "Aldous Huxley", "987654321");


        Reader reader1 = new Reader(1, "Alice", "alice@example.com");
        Reader reader2 = new Reader(2, "Bob", "bob@example.com");


        Librarian librarian = new Librarian(1, "Charlie", "Senior Librarian");


        librarian.addBook(book1);
        librarian.addBook(book2);


        reader1.borrowBook(book1);


        reader2.borrowBook(book1);


        reader1.returnBook(book1);


        reader2.borrowBook(book1);


        Loan loan = new Loan(book1, reader2, new Date(), null);
        loan.issueLoan();


        loan.completeLoan();
    }
}