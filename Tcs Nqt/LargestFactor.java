import java.util.Scanner;

public class LargestFactor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("Enter the value of k : ");
        int lf = sc.nextInt();
        int k = 0;

        int arr[] = new int[num];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                arr[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
        int a=k;
        if (a >= lf) {
            System.out.println("Kth highest Factor is : " + arr[a-lf]);
        } else {
            //ye ku nhi chal rha hai
            System.out.println("1");
        }

    }
}
