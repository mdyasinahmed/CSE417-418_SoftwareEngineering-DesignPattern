

import Lab_02.task_02.InstitutionMember;
import Lab_02.task_02.Person;

// Student class inheriting Person and implementing InstitutionMember
class Student extends Person implements InstitutionMember {

    // Constructor
    public Student(String name, int age) {
        super(name, age);
    }

    // Overriding getRole() method
    @Override
    public String getRole() {
        return "Student";
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Role: " + getRole() + "\nName: " + getName() + "\nAge: " + getAge();
    }
}