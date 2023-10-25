package buoi1;

import java.util.Scanner;

public class Bai1 {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int du = a % b;
            a = b;
            b = du;
        }
        return a;
    }

    public static int BCD(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int UCLN = GCD(GCD(a, b), c);
        int BCNN = BCD(BCD(a, b), c);
        System.out.println(BCNN + " " + UCLN);
        sc.close();
    }

}