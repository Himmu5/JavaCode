import java.util.*;
class clgprogram
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your string : ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch+=32;
            }
            else if(Character.isLowerCase(ch))
            {
                ch-=32;
            }
            else
            {
                System.out.print(" ");
            }
            System.out.print(ch);    
        }

     
    }
};