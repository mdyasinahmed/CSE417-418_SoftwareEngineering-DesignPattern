package MyPractice.OOP_with_Project.LibraryManagement.src.services;
import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_PATH = "books.txt";

    // Save books to file
    public static void saveBooks(ArrayList<MyPractice.OOP_with_Project.LibraryManagement.src.models.Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (MyPractice.OOP_with_Project.LibraryManagement.src.models.Book book : books) {
                writer.write(book.getBookId() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.isAvailable());
                writer.newLine();
            }
            System.out.println("Books saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    // Read books from file
    public static ArrayList<MyPractice.OOP_with_Project.LibraryManagement.src.models.Book> loadBooks() {
        ArrayList<MyPractice.OOP_with_Project.LibraryManagement.src.models.Book> books = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                books.add(new MyPractice.OOP_with_Project.LibraryManagement.src.models.Book(Integer.parseInt(data[0]), data[1], data[2]));
            }
        } catch (IOException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
        return books;
    }
}
