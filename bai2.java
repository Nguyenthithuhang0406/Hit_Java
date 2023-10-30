package buoi2;

import java.util.Scanner;

public class bai2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] pref = new int[n + 1];

        pref[0] = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pref[i + 1] = pref[i] + arr[i];
        }

        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(pref[r] - pref[l - 1]);
        }
        sc.close();
    }
}
