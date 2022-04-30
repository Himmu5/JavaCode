import java.util.*;

public class TimeConversion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String str = "02:45:54AM";
        String str1[] = new String[str.length()];
        if (str.charAt(8) == 'A') {
            if (str.charAt(0) == '1' && str.charAt(1) == '2') {
                str1[0] = str1[1] = String.valueOf(0);
            }
            for (int i = 0; i <= 7; i++) {
                str1[i] = String.valueOf(str.charAt(i));
            }
        } else {
            if (str.charAt(1) == '8') {
                str1[0] = String.valueOf(2);
                str1[1] = String.valueOf(0);
            } else if (str.charAt(1) == '9') {
                str1[0] = String.valueOf(2);
                str1[1] = String.valueOf(1);
            } else if ((str.charAt(0) == '1' && str.charAt(1) == '2')) {
                str1[0] = String.valueOf(1);
                str1[1] = String.valueOf(2);
            } else if (!(str.charAt(0) == '1' && str.charAt(1) == '2')) {
                char c = str.charAt(0);
                c += 1;
                char c1 = str.charAt(1);
                c1 += 1;
                str1[0] = String.valueOf(c);
                str1[1] = String.valueOf(c1);
            }

        }
        for (int i = 2; i <= 7; i++) {
            str1[i] = String.valueOf(str.charAt(i));
        }
        for (int i = 0; i <= 7; i++) {
            System.out.print(str1[i]);
        }
    }
}
