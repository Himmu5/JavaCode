class BetweenTwoSet{
    public static void main(String[] args) {
        int arr[]={2,4};
        int arr1[]={16,32,96};
        int mul[]=new int[10];
        for(int i=0;i<mul.length;i++){
            mul[i]=(i+1)*arr[arr.length-1];
        }
       /* for(int i=0;i<mul.length;i++){
            System.out.println(mul[i]);
        }*/
        int count=0;
        for(int i=0;i<mul.length;i++){
            if(arr1[0]%mul[i]==0&&arr1[1]%mul[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}