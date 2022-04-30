public class AppleAndOrange {
    public static void main(String[] args) {
        int r1 = 7, r2 = 11;
        int a = 5, b = 15;
        int m = 3, n = 2;
        int apple=0,orange=0;
        int app[] = { -2, 2, 1 };
        int orr[] = { 5, -6 };
        for (int i = 0; i < app.length; i++) {
            app[i] = app[i] + a;
        }
        for (int i = 0; i < orr.length; i++) {
            orr[i] = orr[i] + b;
        }
        for(int i=0;i<app.length;i++){
            if(app[i]>=r1&&app[i]<=r2){
                apple++;
            }
        }
        for(int i=0;i<orr.length;i++){
            if(orr[i]>=r1&&orr[i]<=r2){
                orange++;
            }
        }
        System.out.println(apple+"\n"+orange);
    }
}
