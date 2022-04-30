import java.util.Scanner;

public class ConuntingVally {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0, c = 0,count=0;
        String str = sc.nextLine();

        int u=0;
        int d=0;

        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='U'){ 
                count+=1;
           }
           if(str.charAt(i)=='D'){
                count-=1;
           }
           if(count<0){
            c++;
           }

        }
       
            System.out.println(count);
       
    }
}
