import java.util.*;

public class CircularArrayRotation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int queries[] =new int[q];
       
        for (int i = 0; i < queries.length; i++) {
            System.out.println(arr[(n+((sc.nextInt()-k)%n)) % n]);
        }

    }
}
