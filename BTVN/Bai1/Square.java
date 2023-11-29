package Buoi6.BTVN.Bai1;

import java.util.Scanner;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side){
        super(side,side);
    }
    public Square (String color, double side, boolean filled){
        super(color, filled, side, side);
    }

    public double getSide(){
        return  getLength();
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    public  static Square createSquare(){
        Scanner sc = new Scanner(System.in);
        Square square = new Square();
        System.out.println("Nhap mau: ");
        square.color = sc.nextLine();
        System.out.println("hinh vuong co lap day (true/false) :");
        square.filled = sc.nextBoolean();
        System.out.println("nhap canh: ");
        square.length = sc.nextDouble();
        square.width = square.length;
        return square;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
