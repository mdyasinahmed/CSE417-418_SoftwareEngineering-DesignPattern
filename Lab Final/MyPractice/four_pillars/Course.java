package four_pillars;

// Abstract class
public abstract class Course {
    protected String courseName;
    protected int duration; // in months

    // Constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Abstract method
    public abstract void showCourseDetails();

    // Non-abstract method
    public void commonFeatures() {
        System.out.println("All courses have assignments and quizzes.");
    }
}
