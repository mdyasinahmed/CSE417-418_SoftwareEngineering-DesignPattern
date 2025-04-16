package four_pillars;

// Base class demonstrating Method Overloading
class CourseDetails {
    protected String courseName;

    // Constructor
    public CourseDetails(String courseName) {
        this.courseName = courseName;
    }

    // Method Overloading: Same method name, different parameters

    // Overloaded method - No parameters
    public void showDetails() {
        System.out.println("Course: " + courseName);
    }

    // Overloaded method - One parameter
    public void showDetails(int duration) {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months");
    }

    // Overloaded method - Two parameters
    public void showDetails(int duration, String instructor) {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Instructor: " + instructor);
    }
}

// Subclass demonstrating Method Overriding
class AdvancedCourse extends CourseDetails {
    private String difficultyLevel;

    // Constructor
    public AdvancedCourse(String courseName, String difficultyLevel) {
        super(courseName);
        this.difficultyLevel = difficultyLevel;
    }

    // Overriding the showDetails() method from the parent class
    @Override
    public void showDetails() {
        System.out.println("Advanced Course: " + courseName + ", Difficulty Level: " + difficultyLevel);
    }
}
