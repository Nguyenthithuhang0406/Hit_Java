package buoi7_Test.Bai2;

public class Student extends Person{
    private double score;

    public Student(int id, String name, int age, String address, short score, String capacity) {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int id, String name, short age, Address address, double score, String capaCity) {
        super(id, name, age, address);
        this.score = score;
        capaCity = getCapacity();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + getId() +
                ",name = " + getName() +
                ",age = " + getAge() +
                ", address = " + getAddress() +
                ",score=" + score +
                ", capacity = " + getCapacity() +
                '}';
    }

    @Override
    public String getCapacity() {
        if(this.score >= 9.0) return "học lực xuất sắc";
        if(this.score >= 8.0 && this.score < 9.0) return "học lực giỏi";
        if(this.score >= 6.5 && this.score < 8.0) return "học lực khá";
        if (this.score < 6.5) return  "học lực trung bình yếu";
        return null;
    }
}
