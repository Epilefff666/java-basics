package oop.objects.interfaces.example7;

public class Main {
    public static void main(String[] args) {
        /*
         * Here we are using the static method createCircle() from the Shape interface.
         * - Static methods in interfaces belong to the interface itself, not to the implementing classes.
         * - That means we can call Shape.createCircle(…) directly without creating an object of Shape.
         * - This method internally returns a new Circle object initialized with the given radius.
         */
        Shape circle = Shape.createCircle(5);

        /*
         * Once we have the Circle object (through the Shape reference),
         * we can call the getArea() method that was overridden in the Circle class.
         */
        double circleArea = circle.getArea();

        // Print the calculated area of the circle
        System.out.println("Circle area: " + circleArea);
    }
}
