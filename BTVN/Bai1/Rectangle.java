package Buoi6.BTVN.Bai1;

import java.util.Scanner;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return  (width + length) * 2;
    }

    @Override
    public double getPerimeter(){
        return width * length;
    }

    public  static Rectangle createRectangle(){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Nhap mau: ");
        rectangle.color = sc.nextLine();
        System.out.println("hinh chu nhat co lap day (true/false) :");
        rectangle.filled = sc.nextBoolean();
        System.out.println("nhap chieu dai: ");
        rectangle.length = sc.nextDouble();
        System.out.println("nhap chieu rong: ");
        rectangle.width = sc.nextDouble();
        return rectangle;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

