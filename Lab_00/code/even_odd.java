package Lab_00.code;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);

        if(n%2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
