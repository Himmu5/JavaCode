
public class PrimeFibonachi {
    static int[] findPrime(int a, int b) {
        int f, k = 0;
        int arr[] = new int[b];
        for (int i = a; i <= b; i++) {
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
        return arr;
    }

    static int[] findPrimeInArray(int[] arr) {
        int f, k = 0;
        int primeArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            f = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    f++;
                }

            }
            if (f == 2) {
                primeArray[k] = arr[i];
                k++;
            }
        }

        System.out.println("\n" + k);
        return primeArray;
    }

    static int[] sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        } //
        return arr;
    }

    static int[] carticianProduct(int[] arr) {
        int k = 0;
        int a = arr.length * arr.length;
        int[] str = new int[a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] != arr[j]) && (arr[i] != 0 && arr[j] != 0)) {
                    str[k] = Integer.valueOf(String.valueOf(arr[i]) + String.valueOf(arr[j]));
                    k++;
                }
            }
        }
        System.out.println("Cartician Product");
        for (int i = 0; i < str.length; i++) {
            
                System.out.print(str[i] + " ");
            

        }
        return str;
    }

    public static void main(String[] args) {
        int a = 2, b = 40;
        int arr[] = findPrime(a, b);
        System.out.println("Range prime");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int newArray[] = carticianProduct(arr);
        int finalList[] = findPrimeInArray(newArray);
        int newSortFinalList[] = sort(finalList);
        System.out.println("Sorted array printing ---------");
        for (int i = 0; i < newSortFinalList.length; i++) {
            
                System.out.print(newSortFinalList[i] + " ");
            
        }
        
    }
}
