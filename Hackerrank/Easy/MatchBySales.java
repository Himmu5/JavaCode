class MatchBySales {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int arr1[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                count = count + arr1[i] / 2;
            } else {
                count = count + arr1[i] / 2;
            }
        }
        System.out.println(count);
    }
}