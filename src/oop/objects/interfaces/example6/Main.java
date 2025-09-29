package oop.objects.interfaces.example6;

public class Main {
    public static void main(String[] args) {
        // Create a Car object with speed = 120.0
        Car myCar = new Car(120.0);

        /*
         * The following calls demonstrate the use of default methods in the Vehicle interface:
         * - printSpeed(): This is a default method in Vehicle, which internally calls getSpeed().
         *   Since Car overrides getSpeed(), the method prints the actual speed of this Car.
         */
        myCar.printSpeed();

        /*
         * - getFuelType(): This is another default method from Vehicle.
         *   Because Car does not override it, the default implementation is used,
         *   which returns "Petrol".
         */
        System.out.println("Fuel type is: " + myCar.getFuelType());
    }

}
