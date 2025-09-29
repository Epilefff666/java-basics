package oop.objects.interfaces.example6;

public class Car implements Vehicle {

    private double speed;

    // Constructor to initialize the speed of the Car
    public Car(double speed) {
        this.speed = speed;
    }

    /*
     * Overriding the abstract method from Vehicle interface:
     * - Every class that implements Vehicle must provide its own implementation of getSpeed().
     * - Here, it simply returns the value of the speed field.
     */
    @Override
    public double getSpeed() {
        return speed;
    }

    /*
     * Note:
     * - The Car class does not override getFuelType() or printSpeed(),
     *   so it automatically inherits the default implementations from Vehicle.
     * - If we want Car to have a different fuel type (e.g., "Electric"),
     *   we can override getFuelType() in this class.
     */
}

