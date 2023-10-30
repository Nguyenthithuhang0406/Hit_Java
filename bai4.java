package buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase(); //chuyen chuoi s ve ki tu thuong
        char[] kt = new char[256];
        for(int i = 0; i < s.length(); i++){
            kt[s.charAt(i)] = 1;
        }
        boolean k = true;
        for(int i = 'a'; i <= 'z'; i++){
            if(kt[i] == 0) k = false;
        }
        if(k == true) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}
