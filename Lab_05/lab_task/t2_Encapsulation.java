package Lab_05.lab_task;

class t2_Encapsulation {
    private static volatile t2_Encapsulation instance;
    private String frequency;
    private String status;

    private t2_Encapsulation() {
        this.frequency = "107.5 MHz";
        this.status = "Active";
    }

    // double-checked locking
    public static t2_Encapsulation getInstance() {
        if (instance == null) {
            synchronized (t2_Encapsulation.class) {
                if (instance == null) {
                    instance = new t2_Encapsulation();
                }
            }
        }
        return instance;
    }

    // getter methods
    public String getFrequency() {
        return frequency;
    }

    public String getStatus() {
        return status;
    }

    // applied encapsulation
    public synchronized void updateNetworkSettings(String newFrequency, String newStatus) {
        this.frequency = newFrequency;
        this.status = newStatus;
    }
}

