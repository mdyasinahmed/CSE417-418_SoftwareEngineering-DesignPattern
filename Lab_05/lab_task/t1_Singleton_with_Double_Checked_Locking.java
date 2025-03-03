package Lab_05.lab_task;

class t1_Singleton_with_Double_Checked_Locking {
    private static volatile t1_Singleton_with_Double_Checked_Locking instance;
    private String frequency;
    private String status;

    private t1_Singleton_with_Double_Checked_Locking() {
        this.frequency = "107.5 MHz";
        this.status = "Active";
    }

    // double-checked locking
    public static t1_Singleton_with_Double_Checked_Locking getInstance() {
        if (instance == null) {
            synchronized (t1_Singleton_with_Double_Checked_Locking.class) {
                if (instance == null) {
                    instance = new t1_Singleton_with_Double_Checked_Locking();
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
}
