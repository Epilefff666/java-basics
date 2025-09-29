package oop.objects.constructors;

public class Coordinates {
    private int x;
    private int y;

    /**
     * In Java, we can define more than one constructor in a class.
     * This is called **constructor overloading**.
     * Each constructor must differ in its parameter list (number or type of parameters).
     *
     * Below we have two constructors:
     * 1. A no-argument constructor (default values assigned manually).
     * 2. A parameterized constructor (values provided by the caller).
     */

    // No-argument constructor: assigns default values to x and y
    public Coordinates() {
        x = 10;
        y = 15;
    }

    // Parameterized constructor: allows initializing x and y with custom values
    public Coordinates(int x, int y) {
        this.x = x;  // "this" refers to the current object's fields
        this.y = y;
    }

    // Method to print information about the coordinates
    public void printInfo() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
