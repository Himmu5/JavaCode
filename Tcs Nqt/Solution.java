import java.util.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int fsum = 0, ssum = 0, res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
                if (i == j) {
                    fsum += arr[i][j];

                }
                if (j + i == n-1) {
                    ssum += arr[i][j];
                }
            }
        }
        System.out.println(fsum);
        System.out.println(ssum);
        if (fsum > ssum) {
            res += fsum - ssum;
        } else if (fsum < ssum) {
            res += ssum - fsum;
        }
        System.out.println(res);
    }
}
