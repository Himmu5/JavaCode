import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class AngryProfessor {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        
        int c;
        for(int i=0;i<n;i++){
            c=0;
            int len=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[len];
            for(int j=0;j<len;j++){
                arr[j]=sc.nextInt();
                
            }
            for(int l=0;l<arr.length;l++){
                    if(arr[l]<=0){
                    c++;
                }
            }
            if(c<k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        
        }
        
        
    }
}
