package MyPractice.OOP_with_Project.LibraryManagement.src.models;

public class Librarian extends User {
    public Librarian(int userId, String name) {
        super(userId, name);
    }

    // Method to add a book
    public Book addBook(int bookId, String title, String author) {
        System.out.println("Librarian " + name + " added a new book: " + title);
        return new Book(bookId, title, author);
    }
}
