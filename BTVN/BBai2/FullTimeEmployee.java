package Buoi6.BTVN.BBai2;

import java.util.Scanner;

public class FullTimeEmployee extends Employee   {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    public FullTimeEmployee() {

    }

    public int getWorkingHours(){
        return 8;
    }
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten nhan vien: ");
        setName(sc.nextLine());
        System.out.println("nhap luong 1 gio: ");
        setPaymentPerHour(sc.nextInt());
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name = '" + getName() + '\'' +
                ", paymentPerHour = " + getPaymentPerHour()+
                "}";
    }
}
