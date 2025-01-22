package MyPractice.OOP_with_Project.LibraryManagement.src;

import MyPractice.OOP_with_Project.LibraryManagement.src.models.*;
import MyPractice.OOP_with_Project.LibraryManagement.src.services.Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Librarian librarian = new Librarian(1, "Alice");
        
        // Adding books
        Book book1 = librarian.addBook(101, "Java Basics", "James");
        Book book2 = librarian.addBook(102, "OOP in Java", "Robert");
        library.addBook(book1);
        library.addBook(book2);

        // User interaction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(2, userName);

        // Display books
        library.displayBooks();

        // Borrowing a book
        System.out.println("Enter Book ID to borrow: ");
        int bookId = scanner.nextInt();
        user.borrowBook(book1);

        // Display books again
        library.displayBooks();
    }
}

