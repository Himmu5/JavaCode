import java.util.*;
public class BetweenTwoNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 4 };
        int mul[] = new int[20];
        int arr1[] = { 16, 32, 96 };
        int mul1[] = new int[20];
        int i = 0, k = 0;
        for (int j = 1; j < 20; j++, i++) {
            mul[i] = j * arr[0];
        }
        for (int j = 1; j < 20; j++, k++) {
            mul1[k] = j * arr[1];
        }
        /*
         * for(int m=0;m<mul.length;m++){
         * System.out.print(mul[m]+" ");
         * }
         * System.out.println();
         * for(int m=0;m<mul1.length;m++){
         * System.out.print(mul1[m]+" ");
         * }
         */
        int commen1[] = new int[20];
        int t = 0;
        for (int l = 0; i < i; l++) {
            for (int j = 0; j < k; j++) {
                if (mul[l] == mul1[j]) {
                    System.out.print(mul[l] + " ");
                    commen1[t] = mul[l];
                    t++;
                }
            }
        }
        System.out.println("Comment Element  : ");
        for (int j = 0; j < commen1.length; j++) {
            System.out.print(commen1[j] + " ");
        }
    }
}
