import java.util.Scanner;

public class SerielPrint {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = -1, max = -1, Cmin = 0, Cmax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (min == 0 && max == 0) {
                min = arr[i];
                max = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
                Cmax++;
            } else if (arr[i] < min) {
                min = arr[i];
                Cmin++;
            }
        }
        System.out.print(Cmax + " ");
        System.out.print(Cmin);

    }
}
