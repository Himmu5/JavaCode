public class StringCodevita {
    public static void main(String[] args) {
        String str = "pulikujmnhytgbvfredcxswqaz";
        String input = "abcd";
        int arr[] = new int[10];
        int k = 0;
        for (int i = 0; i < input.length(); i++) {
            char c1 = input.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == c1) {
                    System.out.print(c + " " + j + " ");
                    arr[k] = j;
                    k++;
                }
            }
        }
        int temp;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            System.out.print(str.charAt(arr[i]));
        }

    }
}
