package buoi1;

import java.util.Scanner;

public class Bai2 {
    public static void chuyen(int n, int k) {
        if (n < k) {
            System.out.print(n);
        } else {
            chuyen(n / k, k);
            int x = n % k;
            if (x >= 10) {
                x = x % 10 + 'A';
                System.out.print((char) x);
            } else {
                System.out.print(x);
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        chuyen(n, k);
        s.close();
    }
}
