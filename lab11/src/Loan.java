import java.util.Date;

public class Loan {
    private Book book;
    private Reader reader;
    private Date loanDate;
    private Date returnDate;

    public Loan(Book book, Reader reader, Date loanDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public void issueLoan() {
        book.markAsLoaned();
        System.out.println("Loan issued for " + book + " to " + reader);
    }

    public void completeLoan() {
        book.markAsAvailable();
        System.out.println("Loan completed for " + book + " by " + reader);
    }
}
