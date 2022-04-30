import java.util.Scanner;

class NQTPre {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter  string(*)");
        String str = sc.nextLine();
        int n = 0, n1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '*')
                n++;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '#')
                n1++;
        }
        if (n > n1) {
            System.out.println(n - n1);
        } else {
            System.out.println(-n + n1);
        }
    }
}