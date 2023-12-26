package buoi7_Test.Bai1;

import java.util.Scanner;

public class BT1 {
    public static void kiemtra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ngoac: ");
        String input = sc.nextLine();
        int isngoac1 = 0;
        int ngoac1 = 0;
        int isngoac2 = 0;
        int ngoac2 = 0;
        int isngoac3 = 0;
        int ngoac3 = 0;
        int i = 0;
        while (i < input.length() && isngoac1 >= 0 && isngoac2 >= 0 && isngoac3 >= 0){
            if(input.charAt(i) == '(') {
                isngoac1++;
                ngoac1 ++;
            }
            if(input.charAt(i) == ')') {
                isngoac1--;
                ngoac1 ++;
            }
            if(input.charAt(i) == '[') {
                isngoac2++;
                ngoac2 ++;
            }
            if(input.charAt(i) == ']') {
                isngoac2--;
                ngoac2 ++;
            }
            if(input.charAt(i) == '{') {
                isngoac3++;
                ngoac3 ++;
            }
            if(input.charAt(i) == '}') {
                isngoac3--;
                ngoac3 ++;
            }
            i++;
        }
        if( i == input.length() && isngoac1 == 0 && isngoac2 == 0 && isngoac3 == 0){
            System.out.println("TRUE");
            System.out.println("(): " + ngoac1 / 2);
            System.out.println("[]: " + ngoac2 / 2);
            System.out.println("{}: " + ngoac3 / 2);
        }else{
            System.out.println("FALSE");
        }
    }

    public static void main(String[] args) {
        kiemtra();
    }

}
