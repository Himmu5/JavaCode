package NewPractice;
import java.util.*;
public class conditional3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.endsWith(".org"))
        {
            System.out.println("This website is Orgnizational site ");
        }
        else if(s.endsWith(".com"))
        {
            System.out.println("This website is comercial site ");
        }
        else if(s.endsWith(".in"))
        {
            System.out.println("This is Indian Site");
        }
        else
        {
            System.out.println("Muje kya pta kya hai Khud dekh");
        }

    }
}
