import java.util.Scanner;

class Codevita {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter element in array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Limits  : ");
        int count = 0;
        System.out.println("Enter Lower limit");
        int min = sc.nextInt();
        System.out.println("Enter upper limit");
        int max = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }
        System.out.println(" Total element : " + count);

    }
}