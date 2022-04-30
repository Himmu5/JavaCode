public class ArrayPractice3 {
    public static void main(String[] args) {
        int sum=0;
        int a[]={5,4,9,8,3,8,6,15};
        for(int element :a)
        {
            sum=sum+element;
        }
        System.out.println("Avarage of this array is : "+sum/a.length);
    }
}