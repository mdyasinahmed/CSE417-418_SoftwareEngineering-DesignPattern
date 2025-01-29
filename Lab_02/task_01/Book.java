package Lab_02.task_01;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int totalCopies;
    // private int borrowedCopies;
    public int borrowedCopies = 0;

    public Book(String bookId, String title, String author, int totalCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        // this.borrowedCopies = 0;
    }


    public void borrowBook() {
        if (borrowedCopies < totalCopies) {
            borrowedCopies++;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println(title + " is out of stock.");
        }
    }


    public void returnBook() {
        if (borrowedCopies > 0) {
            borrowedCopies--;
            System.out.println(" Returned: " + title);
        } else {
            System.out.println("Not Borrowed: " + title);
        }
    }

   
    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Total: " + totalCopies + ", " + "Available: " + (totalCopies - borrowedCopies));
        System.out.println("");
    }
    public void newLine() {
        System.out.println("");
    }

    public static void main(String[] args) {
        // book 1
        Book book1 = new Book("1111", "Machine Learning Guide", "Andrew Ng", 10);
        
        book1.borrowBook();
        book1.newLine();

        book1.borrowBook();
        book1.newLine();

        // book 2 
        Book book2 = new Book("1112", "Head First Design Pattern", "HeadFirst", 5);
        book2.borrowBook();
        book2.newLine();
        book2.borrowBook();
        book2.newLine();

        book2.returnBook();
        book2.newLine();

        System.out.println("Books Info:");
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}

