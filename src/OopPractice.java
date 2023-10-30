import java.util.Scanner;

public class OopPractice {
    public static void main(String[] args) {
        // declare circle1 type is Circle, it will refer to Circle.java
        try {
            // create a new Circle object
            Circle circle1 = new Circle(-5);
            Circle circle2 = new Circle();
            // Object-oriented programming
            System.out.println(circle1.getArea());
            System.out.println(circle2.getArea());

            // Encapsulate
            circle1.setLength(100);
            System.out.println(circle1.getLength());
        } catch (IllegalArgumentException e) { // catch throw in Circle.jsva
            System.out.println("cannot access radius");
        }


        // Execute Scanner class's constructor
        // Then can use the methods in Scanner class like s.nextDouble()
        Scanner s = new Scanner(System.in);

        // Inheritance
        Teacher teacher1 = new Teacher(30, "abc", "test", "CS");
        teacher1.teach();
        // use @Override
        teacher1.walk();
        Student student1 = new Student(20, "abc", "test", 90);
        // do not use @Override
        student1.learn();

        // Polymorphism
        People teacher3 = new Teacher(40, "ccn", "test", "Music");
        People[] people = new People[3];
        people[0] = teacher1;
        people[1] = teacher3;
        people[2] = student1;
        for (People person : people) {
            System.out.println(person.address);
        }

        // Abstract class
        Dog dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        // Interface
        Edible chicken = new Chicken();
        System.out.println(chicken.howToEat());

        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }
}
