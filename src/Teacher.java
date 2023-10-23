public class Teacher extends People {
    private String subject;

    public Teacher(int age, String email, String address, String subject) {
        // means superclass(parent class)
        super(age, address, email);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("age: " + this.age + "subject: " + this.subject);
        System.out.println("Teaching...");
    }

    // If it uses @Override, then method will be overwritten
    @Override
    public void walk() {
        System.out.println("Teacher's walking...");
    }
}
