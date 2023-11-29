package Buoi6.BTVN.Bai1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Moi ban chon: 1: hinh tron; 2:hinh chu nhat; 3:hinh vuong");
        int choice = sc.nextInt();
        Shape shape = null;

        switch (choice){
            case 1:
                 shape = Circle.createCircle();
                break;
            case 2:
                shape = Rectangle.createRectangle();
                break;
            case 3:
                shape = Square.createSquare();
                break;
        }

        System.out.println("===============================");
        System.out.println("dien tich la:" + shape.getPerimeter() + "\n chu vi la: " + shape.getArea());
    }
}
