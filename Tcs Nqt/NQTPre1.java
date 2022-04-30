import java.util.Scanner;

public class NQTPre1 {
    static Scanner sc=new Scanner(System.in);
    //Find greater number 
    public static void main(String[] args) {
        int arr[]=new int[6];
        int first;
        System.out.println("Enter the element : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           
            }
            for(int i=0;i<arr.length;i++){
                first=arr[0];
                if(first<arr[i]){
                    System.out.println("This number is Greater : "+arr[i]);
            }

        }
    }
}
