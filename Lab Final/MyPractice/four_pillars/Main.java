package four_pillars;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mehrab", 22, "Data Science & ML");
        student1.displayStudentInfo();
        
        System.out.println("");

        
        Course course1 = new ProgrammingCourse("Data Science", 2, "Python");
        Course course2 = new ProgrammingCourse("Machine Learning", 4, "Python");

        // Polymorphism: Different implementations of the same method
        course1.showCourseDetails();
        System.out.println("");
        course2.showCourseDetails();
        
        System.out.println("");

        CourseDetails courseDetails = new CourseDetails("Data Science & ML");
        courseDetails.showDetails();                      // No parameters
        courseDetails.showDetails(6);                     // One parameter
        courseDetails.showDetails(6, "Ahmed Ali");         // Two parameters
        
        System.out.println("");

        AdvancedCourse advancedCourse = new AdvancedCourse("Advanced Data Science & ML", "Expert");
        advancedCourse.showDetails();  // Calls overridden method

        System.out.println("");
    }
}
