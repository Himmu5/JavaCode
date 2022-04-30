package NewPractice;
import java.util.Scanner;
public class ArrayPractice2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user=sc.nextInt();
        int a []={5,4,2,9,10,6};
        for(int element:a){
            if(element==user)
            {
                System.out.println("Element is Available");
                break;
            }
            else
            {
                System.out.println("Not available");
                break;
            }
        }
    }
}
