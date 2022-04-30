public class CountingSort {
    public static void main(String[] args) {
        int arr[]={2,1,2,3,1,2,4};
        int fq[]=new int[arr.length];
        int f;
        for(int i=0;i<arr.length;i++){
            f=arr[i];
            fq[f]++;
        }
        for(int i=0;i<fq.length;i++){
            System.out.println(i+" " +fq[i]);
        }
    }    
}
