package MyPractice.OOP_with_Project.LibraryManagement.src.models;

public class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getBookId() { return bookId; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setAvailable(boolean available) { this.isAvailable = available; }

    // Display book details
    public void displayBook() {
        System.out.println("Book ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
    }
}
