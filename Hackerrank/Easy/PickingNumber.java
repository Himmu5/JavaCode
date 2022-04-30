import java.util.*;

public class PickingNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[] = new int[n];
        int c[] = new int[arr.length];
        int count = 0, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] == arr[j]) || ((arr[i] + 1) == (arr[j]))) {
                    count++;
                }
            }
            c[i] = count;
            count = 0;
        }
        int max;
        max = c[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < c[i]) {
                max = c[i];
            }
        }
        System.out.println(max);
    }
}
