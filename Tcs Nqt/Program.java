
import java.util.Scanner;

class Program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        for (num = 100; num <= 1000; num++) {

            int sum = 0, temp, digit = 0;
            temp = num;
            while (num > 0) {
                num = num / 10;
                digit++;
            }
            num = temp;
            while (num > 0) {
                sum = sum + (int) Math.pow(num % 10, digit);
                num = num / 10;
            }
            num = temp;

            if (num == sum) {
                System.out.println(num);
            }

        }

    }
}