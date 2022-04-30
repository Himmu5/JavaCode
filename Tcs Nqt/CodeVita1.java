public class CodeVita1 {
    static int func(int a) {
        int f = 0, c = 0;
        for (int i = 1; i <= a; i++) {
            if (a > 2 && a < 20) {
                if (a % i == 0) {
                    f++;
                }
            }
        }
        if (f == 2)
            c = 1;

        return c;
    }

    public static void main(String[] args) {
        int a = 20, sum = 0, f, k = 0, m;
        int arr[] = new int[a];
        // 5=2+3
        // 17=2+3+5+7
        for (int i = 2; i < a; i++) {
            f = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    f++;
                }
            }
            if (f == 2) {
                arr[k] = i;
                k++;
            }
        }
        /*
         * for(int i=0;i<k;i++){
         * System.out.println(arr[i]);
         * }
         */
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            m = func(sum);
            if (m == 1) {
                System.out.println(sum);
            }
        }
    }
}
