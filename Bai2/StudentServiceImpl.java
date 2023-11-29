package buoi7_Test.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
public static ArrayList<Student> listStudent = new ArrayList<>();
    @Override
    public void addStudent(Student t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập thông tin sinh viên: " );

        System.out.println("nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("nhập điểm: ");
        short score = sc.nextShort();
        sc.nextLine();
        String capacity = t.getCapacity();
        t = new Student(t.getId(), name,age,address,score, capacity);
        listStudent.add(t);
    }

    @Override
    public void deleteStudent(int id) {
        for (Student st: listStudent) {
            if(st.getId() == id){
                listStudent.remove(st);
            }
        }
    }

    @Override
    public void searchStudent(String name) {
        for (Student st: listStudent) {
            if(st.getName().contains(name)){
                System.out.println(st.toString());
            }
        }
    }

    @Override
    public void sortedStudent() {
        listStudent.sort((o1, o2) -> {
            return (int) (o2.getScore() - o1.getScore());
        });
    }

    @Override
    public void showAllStudent() {
        for (Student st: listStudent) {
            System.out.println(st.toString());
        }
    }
}
