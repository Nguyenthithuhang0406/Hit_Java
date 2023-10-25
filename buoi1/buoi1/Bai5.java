package buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main() {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[3] + " " + arr[4]);
        s.close();
    }
}
