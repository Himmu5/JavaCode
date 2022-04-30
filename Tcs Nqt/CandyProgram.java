class CandyProgram{
    static int[] Sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    static int[] CandySifting(int []arr){
        while(arr.length!=0){
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int Candy[]={5,4,3,2,1};
        int arr[]=Sort(Candy);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}