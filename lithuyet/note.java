package Buoi6.lithuyet;

public class note {
    //Abstract class và interface trong java oop
    //Giao diện(interface) là một khái niệm trong lập trình hướng đối tượng (OOP) cho phép định nghĩa 1 tập hợp các phương thức trừu tượng(abstract methods) mà các lớp phải triển khai
    //nó chỉ định giao diện (contracts) mà các lớp phải tuân theo, nhưng không cung cấp bất kì triển khai cụ thể nào


    // định nghĩa một giao diện speakable
//    interface Speakable{
//        void  speak();
//    }
//
//    //lớp Dog triển khai giao diện Speakable
//    class  Dog implements Speakable{
//        @Override
//        public void speak(){
//            System.out.println("woof!");
//        }
//    }
//

    //abstract class
    //là một lớp mà bạn không thể tạo một đối tượng cụ thể từ nó. Nó có thể chứa phương thức trừu tượng (abstract methods) cũng như phương thức không trừu tượng (concrete methods) và thuộc tính

    //lớp trừu tượng animal
//    abstract class Animal{
//        protected String name;
//
//        public  Animal(String name){
//            this.name = name;
//        }
//
//        //phương thức trừu tượng speak
//        public  abstract void speak();
//
//        //phương thức không trừu tượng
//        public void eat(){
//            System.out.println(name + "is eating.");
//        }
//    }

    //Lớp Dog kế thừa từ lớp trừu tượng animal
//    class Dog extends Animal{
//        public Dog(String name){
//            super(name);
//        }
//        @Override
//        public void speak(){
//            System.out.println(name + "says woof!");
//        }
//    }
//
//    //tính trừu tượng: là 1 khái niệm cho phép ẩn đi các chi tiết phức tạp và chỉ tập trung vào các tính chất và hành vi quan trọng. Mục tiêu là đơn giản hoá và giảm độ phức tạp của mã nguồn

    //giao diện(interface)

    //định nghĩa 1 giao diện speakable
//    public interface Speakable {
//        void speak();
//    }
//    //lớp Dog triển khai giao diện Speakable
//    public class Dog implements Speakable{
//        @Override
//        public void speak(){
//            System.out.println("woof!");
//        }
//    }
//    //lớp Cat triển khai giao diện Speakable
//    public class Cat implements Speakable{
//        @Override
//        public void speak(){
//            System.out.println("meow!");
//        }
//    }
//        public static void main(String[] args) {
//            Speakable dog = new Dog();
//            Speakable cat = new Cat();
//
//            dog.speak(); ///output: woof!
//            cat.speak(); ///output: meow!
//        }

        //đa hình là khả năng của các đối tượng của các lớp khác nhau để đáp ứng một phương thức cụ thể theo cách riêng của họ

    //lớp trừu tượng Animal
//    abstract class Animal{
//        protected  String name;
//        public  Animal(String name){
//            this.name = name;
//        }
//
//        //phương thức trừu tượng speak
//        public  abstract  void speak();
//    }

    //lớp Dog kế thừa từ lớp trừu tượng Animal
//    class  Cat extends Animal{
//        public Cat(String name){
//            super(name);
//        }
//
//        @Override
//        public  void  speak(){
//            System.out.println(name + "say meow!");
//        }
//    }
//
////    public static void main(String[] args) {
//        Animal dog = new Dog("buddy");
//        Animal cat = new Cat("whiskers");
//
//        dog.speak(); //output: buddy says wooof!
//        cat.speak(); //output: whiskers says meow!
//    }

    //upcasting và downcasting trong java

//    class Animal{
//        public void sound(){
//            System.out.println("some sound");
//        }
//    }

//    class  Cat extends  Animal{
//        public void sound(){
//            System.out.println("woof woof");
//        }
//    }
//
//    public class Entry{
//        public static void main(String[] args) {
//            //up-casting
//            Animal animal1 = new Cat();
//            animal1.sound();
//            //up-casting
//            Animal animal2 = new  Dog();
//            animal2.sound();
//        }
//    }
}

