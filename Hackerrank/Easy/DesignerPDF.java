import java.util.Scanner;

class Solution {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // char a=sc.nextLine().charAt(0);
        int arr[] ={4, 2, 1, 2, 3, 4, 3, 7, 4 ,1 ,5 ,6, 1, 3, 2, 6, 6 ,3 ,7 ,3 ,1, 1, 5, 1, 1, 4} ;
        int arr1[]=new int[26];
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }*/
        String word=sc.nextLine();
        char mychar[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        int k=0,max=0;
        for(int i=0;i<word.length();i++){
            for(int j=0;j<mychar.length;j++){
                if(word.charAt(i)==mychar[j]){
                    arr1[k]=arr[j];
                    k++;
                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println(max*word.length());
        

    }
}