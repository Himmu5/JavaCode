class GraddingStudent{
    public static void main(String[] args) {
        int arr[]={35,73,91,62};
        for(int i=0;i<arr.length;i++){
            if(!(arr[i]<=40)){
                if(arr[i]%10==1||arr[i]%10==2){
                    System.out.println(arr[i]);
                }
                else if(arr[i]%10==3){
                    System.out.println(arr[i]+2);
                }
                else if(arr[i]%10==4){
                    System.out.println(arr[i]+1);
                }
                else if(arr[i]%10==8){
                    System.out.println(arr[i]+2);
                }
                else if(arr[i]%10==9){
                    System.out.println(arr[i]+2);
                }
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}