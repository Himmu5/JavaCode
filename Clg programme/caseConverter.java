import java.util.*;
class caseConverter
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String originalText,convertedText="";
        System.out.println("Enter your text :");
        originalText=sc.nextLine();
        for(int i=0;i<originalText.length();i++)
        {
            char ch=originalText.charAt(i);
            if(Character.isLowerCase(ch))
            {
                convertedText+=Character.toUpperCase(ch);
            }

            //else ke bina ku space nhi aa rhi hai
            
         else
         {
             convertedText+=Character.toUpperCase(ch);
         }
        }
        System.out.println(convertedText);

    }
}