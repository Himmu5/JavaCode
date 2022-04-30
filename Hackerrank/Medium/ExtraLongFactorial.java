import java.math.BigInteger;
import java.util.Scanner;

class ExtraLongFactorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        BigInteger bg = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bg = bg.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bg);
    }
}