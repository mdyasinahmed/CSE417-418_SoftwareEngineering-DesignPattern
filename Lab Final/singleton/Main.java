package Lab_05.singleton_task;

// Singleton with Double-Checked Locking
class RadioNetworkManager {
    private static volatile RadioNetworkManager instance;
    private String frequency = "107.5 MHz";
    private String status = "Active";

    private RadioNetworkManager() {}

    public static RadioNetworkManager getInstance() {
        if (instance == null) {
            synchronized (RadioNetworkManager.class) {
                if (instance == null) {
                    instance = new RadioNetworkManager();
                }
            }
        }
        return instance;
    }

    public void updateNetworkSettings(String frequency, String status) {
        this.frequency = frequency;
        this.status = status;
    }

    public String getNetworkInfo() {
        return "Frequency: " + frequency + ", Status: " + status;
    }
}

// Encapsulation and Inheritance
class Staff {
    private String name;
    private int staffId;
    private String contactNumber;

    public Staff(String name, int staffId, String contactNumber) {
        this.name = name;
        this.staffId = staffId;
        this.contactNumber = contactNumber;
    }

    public String getRolePermissions() {
        return "General Staff Access";
    }
}

class Ranger extends Staff {
    public Ranger(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Control Access";
    }
}

class Vet extends Staff {
    public Vet(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Medical Access";
    }
}

class Volunteer extends Staff {
    public Volunteer(String name, int staffId, String contactNumber) {
        super(name, staffId, contactNumber);
    }

    @Override
    public String getRolePermissions() {
        return "Observation Only";
    }
}

public class Main {
    public static void main(String[] args) {
        // Singleton test
        RadioNetworkManager network = RadioNetworkManager.getInstance();
        System.out.println(network.getNetworkInfo());
        
        // Staff test
        Staff ranger = new Ranger("John", 101, "1234567890");
        Staff vet = new Vet("Alice", 102, "0987654321");
        Staff volunteer = new Volunteer("Bob", 103, "1122334455");
        
        System.out.println("Ranger Permissions: " + ranger.getRolePermissions());
        System.out.println("Vet Permissions: " + vet.getRolePermissions());
        System.out.println("Volunteer Permissions: " + volunteer.getRolePermissions());
    }
}
