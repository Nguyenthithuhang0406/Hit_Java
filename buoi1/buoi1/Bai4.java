package buoi1;

import java.util.Scanner;

public class Bai4 {
    public static void tinh(long a, long b, char tt) {
        if (tt == '+')
            System.out.println(a + b);
        if (tt == '-')
            System.out.println(a - b);
        if (tt == '*')
            System.out.println(a * b);
        if (tt == '/')
            System.out.println(a * 1.0 / b);
    }

    public static void main(){
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        char tt = s.next().charAt(0);
        long b = s.nextLong();
        tinh(a, b, tt);
        s.close();
    }
}
