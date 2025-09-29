package oop.objects.interfaces.example6;

public interface Vehicle {
    // Abstract method: every class that implements Vehicle must provide its own implementation
    double getSpeed();

    /*
     * Default methods in interfaces:
     * - Introduced in Java 8 to allow interfaces to provide method implementations.
     * - They let you add new functionality to interfaces without breaking classes that already implement them.
     * - A class can override this method if it wants to provide a custom behavior.
     */
    default String getFuelType() {
        return "Petrol"; // default implementation returns "Petrol"
    }

    /*
     * Another example of a default method:
     * - This method uses the abstract method getSpeed().
     * - Any class implementing Vehicle automatically inherits this behavior unless it overrides it.
     */
    default void printSpeed() {
        System.out.println("The speed is: " + getSpeed());
    }
}
