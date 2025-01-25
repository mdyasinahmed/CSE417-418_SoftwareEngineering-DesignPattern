package four_pillars;

// extending the abstract class Course
public class ProgrammingCourse extends Course {
    private String programmingLanguage;

    // Constructor
    public ProgrammingCourse(String courseName, int duration, String programmingLanguage) {
        super(courseName, duration); // Calling superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Implementing the abstract method
    @Override
    public void showCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
