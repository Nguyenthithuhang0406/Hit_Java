package buoi1;

import java.util.Scanner;

public class Bai3 {
    public static long tich(long n) {
        long res = 1;
        while (n > 0) {
            res *= (n % 10);
            n = n / 10;
        }
        return res;
    }

    public static void main() {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.print(tich(n));
        s.close();
    }
}
