import java.util.Scanner;

class WarnPrisoner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n=sc.nextInt();
            long m=sc.nextInt();
            long s=sc.nextInt();
            long result=((m+s-1)%n);
            if(result==0){
                result=n;
            }
            System.out.println(result);
        }
        
    }
}