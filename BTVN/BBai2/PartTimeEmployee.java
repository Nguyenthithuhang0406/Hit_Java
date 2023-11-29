package Buoi6.BTVN.BBai2;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public PartTimeEmployee() {

    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymentPerHour();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten nhan vien: ");
        setName(sc.nextLine());
        System.out.println("nhap luong lam 1 gio: ");
        setPaymentPerHour(sc.nextInt());
        System.out.println("nhap so gio lam viec: ");
        workingHours = sc.nextInt();
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name = '" + getName() + '\'' +
                ", paymentPerHour = " + getPaymentPerHour() +
                ", workingHours=" + workingHours +
                '}';
    }
}
