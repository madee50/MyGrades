public class Student {
    int studentNumber;
    String studentName;
    Grade.Grades grade;


    void addGrade() {


    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }
}
