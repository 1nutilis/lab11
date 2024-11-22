public class Librarian {
private int id;
private String name;
private String position;

public Librarian(int id, String name, String position) {
    this.id = id;
    this.name = name;
    this.position = position;
}

public void addBook(Book book) {
    System.out.println("Book added: " + book);
}

public void removeBook(Book book) {
    System.out.println("Book removed: " + book);
}
}