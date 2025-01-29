package Lab_02.task_2;

public class Student extends Person implements InstitutionMember {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Role: " + getRole() + "\nName: " + getName() + "\nAge: " + getAge();
    }
}

