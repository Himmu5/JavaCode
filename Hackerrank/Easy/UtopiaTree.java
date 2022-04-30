import java.io.*;
import java.util.*;

public class UtopiaTree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int height[] = new int[100];
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                height[i] = 1;
            } else if (i > 0 && i % 2 != 0) {
                height[i] = height[i - 1] * 2;
            } else if (i > 0 && i % 2 == 0) {
                height[i] = height[i - 1] + 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(height[arr[i]]);
        }
    }
}
