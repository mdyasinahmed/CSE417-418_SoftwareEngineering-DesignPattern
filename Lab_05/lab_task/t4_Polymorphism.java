package Lab_05.lab_task;

// base class
class Staff {
    protected String name;
    protected int staffId;
    protected String contactNumber;

    public Staff(String name, int staffId, String contactNumber) {
        this.name = name;
        this.staffId = staffId;
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Permissions: " + getRolePermissions());
    }

    public String getRolePermissions() {
        return "Permitted for General Access.";
    }
}

// subclasses
class Ranger extends Staff {
    public Ranger(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    // applying polymorphism
    @Override
    public String getRolePermissions() {
        return "Permitted for Control Access.";
    }
}

class Vet extends Staff {
    public Vet(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Permitted for Medical Access.";
    }
}

class Volunteer extends Staff {
    public Volunteer(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Permitted for Observation.";
    }
}


public class t4_Polymorphism {
    // applied in Main class
}

