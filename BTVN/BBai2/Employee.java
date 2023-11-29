package Buoi6.BTVN.BBai2;

public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public Employee() {

    }
    public abstract int getWorkingHours();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", paymentPerHour=" + paymentPerHour +
                '}';
    }
}
