package Lab_00.code;
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 5;

        for (int i=0; i<row; i++) {
            for (int j=0; j< row - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
