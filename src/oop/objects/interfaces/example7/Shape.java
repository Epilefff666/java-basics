package oop.objects.interfaces.example7;

public interface Shape {
    // Abstract method that must be implemented by any class implementing Shape
    double getArea();

    /*
     * This is a static method inside the interface.
     * - Static methods in interfaces belong to the interface itself, not to its instances.
     * - They cannot be overridden by implementing classes.
     * - To call this method, we use the interface name directly: Shape.createCircle(5).
     *
     * In this example, createCircle is a factory method:
     * it returns a new Circle object initialized with the given radius.
     */
    static Shape createCircle(double radius) {
        return new Circle(radius);
    }
}

