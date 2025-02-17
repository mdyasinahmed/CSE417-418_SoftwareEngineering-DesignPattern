package Lab_04.database_task;

class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean isConnected = false;

    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        if (isConnected) {
            System.out.println("Already connected!");
        } else {
            isConnected = true;
            System.out.println("Connected...!!");
        }
    }

    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Disconnected...!!");
        } else {
            System.out.println("No Active Connection!");
        }
    }
}
