package buoi2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int chu = 0;
        int so = 0;
        int dacbiet = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                so++;
            else if (Character.isLetter(s.charAt(i)))
                chu++;
            else
                dacbiet++;
        }
        System.out.println(chu + " " + so + " " + dacbiet);
        sc.close();
    }
}
