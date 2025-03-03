package Lab_05.lab_task;

public class Main {
    public static void main(String[] args) {
        Staff ranger = new Ranger("MD. Mahmud", 111, "0123456789");
        ranger.displayInfo();
        System.out.println();

        Staff vet = new Vet("MR. Shafi", 112, "0123456789");
        vet.displayInfo();
        System.out.println();
        
        Staff volunteer = new Volunteer("MR. Muhaimin", 113, "0123456789");
        volunteer.displayInfo();
        System.out.println();
    }
}
