package MyPractice.OOP_with_Project.LibraryManagement.src.models;

public class User {
    protected String name;
    protected int userId;

    // Constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    // Method to borrow a book
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to return a book
    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(name + " returned: " + book.getTitle());
    }
}