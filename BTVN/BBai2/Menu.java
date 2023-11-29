package Buoi6.BTVN.BBai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public  static ArrayList<Employee> listnv = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int sl = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < sl; i++){
            System.out.println("===================");
            System.out.println("chon nhan vien... 1: partTime; 2: fullTime");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
                    partTimeEmployee.nhap();
                    listnv.add(partTimeEmployee);
                    break;
                case 2:
                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
                    fullTimeEmployee.nhap();
                    listnv.add(fullTimeEmployee);
                    break;
            }
        }

        //in tat ca thong tin nhan vien
        System.out.println("======thong tin nhan vien=============");
        for (Employee employee: listnv) {
            System.out.println(employee.toString());
        }

        sortByPay();
        System.out.println("============thong tin nhan vien sau khi sap xep luong giam dan: ");
        for (Employee employee: listnv) {
            System.out.println(employee.toString());
        }

        System.out.println("========nhan vien co so gio lam viec nhieu nhat la:");
        searchByHour();

        System.out.println("===========thong tin nhan vien con lai sau khi xoa nhan vien co so gio lam it nhat la ===========================");
        RemoveMin();



    }

    //sap xep theo luong giam dan
    public static void  sortByPay(){
        listnv.sort((o1, o2) -> {
            return o2.calculateSalary() - o1.calculateSalary();
        });
    }

    //tim nhan vien lam nhieu gio nhat
    public static void searchByHour(){
       int time = 0;
        for (Employee em: listnv) {
            if(em.getWorkingHours() > time){
                time = em.getWorkingHours();
            }
        }
        for (Employee em:listnv) {
            if(em.getWorkingHours() == time){
                System.out.println(em.toString());
            }
        }


    }

    //tim nhan vien lam it gio nhat
    public static void RemoveMin(){
        int time = 1000000;
        for (Employee em: listnv) {
            if (em.getWorkingHours() < time){
                time = em.getWorkingHours();
            }
        }
        for (Employee em: listnv) {
            if(em.getWorkingHours() == time){
                listnv.remove(em);
            }
        }
        for (Employee em: listnv) {
            System.out.println(em.toString());
        }

    }

}
