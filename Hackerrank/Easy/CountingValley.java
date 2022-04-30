import java.util.Scanner;

class CountingValley{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(str[i]=='U'){
                c++;
                arr[i]=c;
            }
            if(str[i]=='D'){
                c--;
                arr[i]=c;
            }
        }
        c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0&&arr[i+1]==0){
                c++;
            }
        }
        System.out.println(c);


    }
}