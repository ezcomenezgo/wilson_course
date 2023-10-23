public class Student extends People {
    public Student(int age, String email, String address) {
        super(age, address, email);
    }

    public void learn() {
        super.walk();
    }
}
