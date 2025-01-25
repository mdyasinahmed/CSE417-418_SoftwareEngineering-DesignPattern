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

    // Abstract method (must be implemented by subclasses)
    public abstract void showCourseDetails();

    // Non-abstract method (optional implementation in subclasses)
    public void commonFeatures() {
        System.out.println("All courses have assignments and quizzes.");
    }
}
