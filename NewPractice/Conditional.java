
import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        float m1,m2,m3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1=sc.nextFloat();
        System.out.println("Enter your marks in math");
        m2=sc.nextFloat();
        System.out.println("Enter your marks in Chemistry");
        m3=sc.nextFloat();
        float avg=m1+m2+m3/3.0f;
        System.out.println("Your overall persent marks is :"+avg);
        if(avg>=40&&m1>=33&&m2>=33&&m3>=33)
        {
            System.out.println("Congratulations, you have been prmoted");
        }
        else
        {
            System.out.println("You failed");
        }

        
    }   
}
