package oop.objects.constructors;

public class Rectangle {

    int width;
    int height;

    /**
     * Parameterized constructor:
     * - Requires two parameters (width and height).
     * - Initializes the instance variables with the values provided.
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * No-argument constructor (also called default constructor):
     * - Does not require any parameters.
     * - Instead of duplicating initialization logic, it calls
     *   the parameterized constructor using the "this()" keyword.
     * - Here, it initializes width and height with default values (0, 0).
     */
    public Rectangle() {
        this(0, 0);
    }

    // Method to display rectangle information
    public void printInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
