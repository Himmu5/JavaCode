import java.util.Scanner;

public class Program2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        
        
        for(int num=100;num<=1000;num++){
            int fact=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    fact++;
                }
            }
            if(fact>=2){
                System.out.println("This is prime number ");
            }
        }
    }
}
