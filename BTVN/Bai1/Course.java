package buoi7_Test.BTVN.Bai1;

import java.util.List;

public class Course implements Displayable {
    private  String courseId;
    private String courseName;
    private List<Student> students;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }

    public Course(String courseId, String courseName, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = students;
    }

    public void enrolStudent(Student st){
            students.add(st);
            st.enroll(this);
    }
    @Override
    public void displayInfo() {
            System.out.printf("Course ID: %s\n", courseId);
            System.out.printf("Course name: %s\n", courseName);
            for (Student st : students){
                st.displayInfo();
            }
    }
}
