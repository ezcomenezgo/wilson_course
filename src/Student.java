public class Student extends People {
    int grade;

    public Student(int age, String email, String address, int grade) {
        super(age, address, email);
        this.grade = grade;
    }

    public void learn() {
        super.walk();
    }
}
