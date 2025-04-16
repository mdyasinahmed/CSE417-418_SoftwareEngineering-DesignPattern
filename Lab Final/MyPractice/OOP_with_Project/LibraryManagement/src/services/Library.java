package MyPractice.OOP_with_Project.LibraryManagement.src.services;
import java.util.ArrayList;

public class Library {
    private ArrayList<MyPractice.OOP_with_Project.LibraryManagement.src.models.Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(MyPractice.OOP_with_Project.LibraryManagement.src.models.Book book) {
        books.add(book);
    }

    // Display all books
    public void displayBooks() {
        for (MyPractice.OOP_with_Project.LibraryManagement.src.models.Book book : books) {
            book.displayBook();
        }
    }

    // Multithreading to allow simultaneous borrowing
    public synchronized void borrowBook(int bookId) {
        for (MyPractice.OOP_with_Project.LibraryManagement.src.models.Book book : books) {
            if (book.getBookId() == bookId && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book " + book.getTitle() + " is now borrowed.");
                return;
            }
        }
        System.out.println("Book not available.");
    }
}
