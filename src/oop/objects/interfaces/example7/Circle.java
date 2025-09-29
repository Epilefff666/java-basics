package oop.objects.interfaces.example7;

public class Circle implements Shape {
    private double radius;

    // Constructor to initialize the Circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    /*
     * This method overrides the abstract getArea() method from the Shape interface.
     * - Every class that implements Shape must provide its own implementation.
     * - For a circle, the area is calculated using the formula: π * r^2
     * - Math.PI provides a precise constant value for π (pi).
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
