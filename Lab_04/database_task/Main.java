package Lab_04.database_task;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();
        db1.disconnect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        
        db2.disconnect();
    }
}