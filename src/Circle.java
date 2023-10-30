public class Circle {
    // getter and setter
    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.out.println("It's not a valid value");
        } else if (length > 1000) {
            System.out.println("It's not meet the requirement");
        } else {
            this.length = length;
        }
    }

    // Declare attribute of Circle
    // use 'public' make it can be used everywhere
    // use 'private' make it only be used in this class, normally will do this action
    // the variable declared above constructor called Fields
    private double radius;
    // Encapsulate
    private int length;
    // use 'static' can avoid occupy memory space when declare many Circle objects
    // And it belongs to class
    private static final double PI = 3.14;

    // A class can have many constructors, it uses "methods overloading" concept
    // make codes more flexible
    public Circle() {
        this(1);
    }

    // Circle class's constructor
    // The name needed to the same with the class
    // it won't return any value
    // it will do a new object
    public Circle(double radius) {
        // throw
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        } else {
            // 'this' means the class itself
            this.radius = radius;
        }
        // variable declared in the methods called local variables
        int x = 3;
    }

    // methods normally be set in 'public'
    public double getArea() {
        return Circle.PI * radius * radius;
    }
}
