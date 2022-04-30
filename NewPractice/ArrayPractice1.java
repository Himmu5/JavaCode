package NewPractice;
public class ArrayPractice1 {
    public static void main(String[] args) {
        float A[]={5.4f,4.5f,3.5f,8.2f,2.3f};
        float sum=0;
        for(float element :A){
            sum=sum+element;
        }
        System.out.println("Sum of these numbers is : "+sum);
    }
}
