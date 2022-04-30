public class SequenceEquation {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 3, 4 };
        int arr1[]=new int[arr.length];
        int k=0;
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    //j+1
                    arr1[k]=j+1;
                    k++;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr1[i]==arr[j]){
                    System.out.println(j+1);
                }
            }
        }
    }
}