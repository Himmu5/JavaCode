
import java.util.Scanner;

class Greater {

    Greater(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.print("First Number is Greater ");
        } else if (a < b && b > c) {
            System.out.print("Second Number is Greater ");
        } else {
            System.out.print("Third  Number is Greater ");
        }
    }
}

public class Program1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();
        Greater ob = new Greater(a, b, c);

    }
}
