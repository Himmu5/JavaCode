import java.util.*;

class NQTPre2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int even = 0, odd = 0;
        String str1[] = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
            if ((str1[i].length()) % 2 == 0) {
                even++;
            } else
                odd++;
        }
        System.out.print(Arrays.toString(str1));
        System.out.print(even + " " + odd);
    }
}