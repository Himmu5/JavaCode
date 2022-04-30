public class LonelyInteger {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int f = 0;
                if (arr[i] == arr[j]) {
                    f++;
                }
            }
        }
    }
}
// int a;
// printf ("%d",a);
