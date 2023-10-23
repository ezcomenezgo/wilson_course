public class People {
    protected int age;
    protected String email;
    protected String address;

    public People(int age, String email, String address) {
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}
