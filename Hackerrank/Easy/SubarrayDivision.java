import java.util.Scanner;
import java.applet.*;
class SubarrayDivision {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args)  {
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0,sum;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<=n-m;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=arr[i+j];
            }if(sum==d){
                temp++;
            }
        }
        System.out.println(temp);
    }
}
//1,2,2,3