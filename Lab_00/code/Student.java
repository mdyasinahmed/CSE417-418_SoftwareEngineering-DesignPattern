package Lab_00.code;

public class Student {
    // Fields with appropriate access modifiers
    private String name;
    private String id;
    private float cgpa;

    // Default constructor
    public Student() {
        this.name = "No name";
        this.id = "0000";
        this.cgpa = 0.0f;
    }

    // Parameterized constructor
    public Student(String name, String id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Student student1 = new Student();
        student1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Student student2 = new Student("John Doe", "12345", 3.8f);
        student2.displayDetails();
    }
}

