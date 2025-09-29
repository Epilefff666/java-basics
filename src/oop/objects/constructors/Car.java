package oop.objects.constructors;

public class Car {
    private String make;
    private String model;
    private int year;

    /**
     * Parameterized constructor (currently commented out).
     * - A parameterized constructor allows us to initialize an object with specific values
     *   at the time of creation.
     * - Example: new Car("Toyota", "Corolla", 2020);
     */
//    public Car(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }

    /**
     * Default constructor:
     * - Since we did not explicitly define any constructor (the one above is commented out),
     *   the compiler automatically provides a default constructor.
     * - The default constructor takes no arguments and leaves the fields with their
     *   default values (null for objects like String, 0 for int).
     * - Example: new Car(); will create a Car object with make = null, model = null, year = 0.
     */

    // Method to print information about the Car object
    public void printInfo() {
        System.out.println("Make: " + make);   // prints null if not initialized
        System.out.println("Model: " + model); // prints null if not initialized
        System.out.println("Year: " + year);   // prints 0 if not initialized
    }
}
