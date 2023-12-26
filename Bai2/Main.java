package buoi7_Test.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban lua chon: (1): thêm sinh viên vào danh sách; (2): xoá sinh viên theo id; (3): tìm sinh viên chứa tên yêu cầu; (4): sắp xếp danh sách sinh viên theo score giảm dần; (5): hiển thị danh sách sinh viên:  ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:

                break;
            case 2:
                System.out.println("nhập id sinh viên cần xoá: ");
                int id = Integer.parseInt(sc.nextLine());
                break;
            case 3:
                System.out.println("nhập tên sinh viên cần tìm: ");
                String name = sc.nextLine();
                break;
            case 4:

            case 5:

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

    }
}
