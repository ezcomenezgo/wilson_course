import java.util.Scanner;

public class OopPractice {
    public static void main(String[] args) {
        // declare circle1 type is Circle, it will refer to Circle.java
        // create a new Circle object
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        // Object-oriented programming
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());

        // Execute Scanner class's constructor
        // Then can use the methods in Scanner class like s.nextDouble()
        Scanner s = new Scanner(System.in);
        circle1.setLength(100);
        System.out.println(circle1.getLength());
    }
}
