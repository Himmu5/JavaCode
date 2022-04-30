import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MigratoryBird {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0, temp;
        int n = sc.nextInt();
        int arr[] = new int[n];
        int f[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            f[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(f[i] + " ");
        }
        int max = f[0];

        System.out.println();
        for (int i = 1; i < f.length; i++) {
            if (max < f[i]) {
                max = f[i];
            }
        }
        for (int j = 0; j < f.length; j++) {
            if (max == f[j]) {
                System.out.println(j);
                break;
            }
        }

    }
}
