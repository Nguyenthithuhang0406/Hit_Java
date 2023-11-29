package Buoi6.BTVN.Bai1;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  static Circle createCircle(){
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhap mau: ");
        circle.color = sc.nextLine();
        System.out.println("hinh tron co lap day (true/false) :");
        circle.filled = sc.nextBoolean();
        System.out.println("nhap ban kinh: ");
        circle.radius = sc.nextDouble();
        return  circle;
    }

    @Override
    public  double  getArea(){
        return Math.PI * 2 * radius;
    }

    @Override
    public double getPerimeter(){
        return  Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
