class BeautifulDay {
    public static void main(String[] args) {
        int r1 = 20;
        int r2 = 23;
        int k = 6, m = 0;
        int arr[] = new int[r1];
        for (int i = r1; i <= r2; i++, m++) {
            arr[m] = i;
        } /*
           * for(int i=0;i<m;i++){
           * System.out.println(arr[i]);
           * }
           */
        int rev[] = new int[m];
        int sum = 0, n;
        int digit = 0, j = 0;

        for (int i = 0; i < m; i++) {
            int temp = 0;
            while (arr[i] > 0) {
                temp = arr[i];
                digit = arr[i] % 10;
                sum = sum * 10 + digit;
                arr[i] = arr[i] / 10;

            }
            arr[i] = temp;

            rev[i] = sum;
            sum = 0;
            temp = 0;
        }
        m = 0;
        for (int i = r1; i <= r2; i++, m++) {
            arr[m] = i;
        }/*
        System.out.println("Orignal");
        for (int i = 0; i < m; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Reversed");
        for (int i = 0; i < m; i++) {
            System.out.println(rev[i]);
        }*/
        int a, count = 0;
        for (int i = 0; i < m; i++) {
            if (arr[i] > rev[i]) {
                a = arr[i] - rev[i];
                a = a % k;
                if (a == 0) {
                    count++;
                }
            } else if (arr[i] < rev[i]) {
                a = rev[i] - arr[i];
                a = a % k;
                if (a == 0) {
                    count++;
                }
            } else if (arr[i] == rev[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}