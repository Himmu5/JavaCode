class NumberLine{
    public static void main(String[] args) {
        //0342
        int x1=28;
        int v1=8;
        int x2=96;
        int v2=2;
        if(x1<x2&&v1<=v2||x2<x1&&v2<=v1){
            System.out.println("NO");
        }
       else{
           while(x1<x2){
            x1+=v1;
            x2+=v2;
            
           }
           while(x1>x2){
            x1+=v1;
            x2+=v2;
           }
           if(x1==x2){
            System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }

    }
}