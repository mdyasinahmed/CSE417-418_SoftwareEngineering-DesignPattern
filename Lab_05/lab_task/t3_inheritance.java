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
    }
}

// subclasses - applied Inheritance
class Ranger extends Staff {
    public Ranger(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }
}

class Vet extends Staff {
    public Vet(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }
}

class Volunteer extends Staff {
    public Volunteer(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }
}

public class t3_inheritance {
    // applied in Main class
}

