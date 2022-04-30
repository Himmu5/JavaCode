import java.util.Scanner;

public class BreakingTheRecord {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int arr[]=new int [n];
        int plus=0,minus=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                plus++;
            }
            if(min>arr[i]){
                min=arr[i];
                minus++;
            }
        }
        System.out.println(minus+" "+plus);
    }
}
