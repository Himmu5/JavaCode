public class ViralAds {
    public static void main(String[] args) {
        int day=5;
        int first=5,like=first/2,CM=like;
        for(int i=0;i<day-1;i++){
            first=like*3;
            like=first/2;
            
            CM+=like;
        }
        System.out.println(CM);
    }
}
