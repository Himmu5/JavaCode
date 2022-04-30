import java.util.Scanner;

public class RockCodeVita {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int input = 10;
        int r = 2;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        /*
         * for (int i = 0; i < arr.length; i++) {
         * arr[i] = sc.nextInt();
         * }
         */
        int temp;
        for (int k = 0; k < arr.length; k++) {
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[k] > arr[j]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        /*
         * for (int i = 0; i < r; i++) {
         * if(r==1){
         * 
         * }
         * }
         */
        for (int i = 0; i < r; i++) {
            System.out.println("Enter first element : ");
            int a = sc.nextInt();
            System.out.println("Enter the second element : ");
            int b = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] >= a) && (arr[j] <= b)) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
