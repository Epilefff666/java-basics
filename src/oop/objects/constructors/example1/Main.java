package oop.objects.constructors.example1;

public class Main {
    public static void main(String[] args) {

        /**
         * Creating a Person object using a parameterized constructor.
         * - We pass "John" (String) and 24 (int) as arguments.
         * - These values initialize the 'name' and 'age' fields of the Person object.
         */
        Person person = new Person("John", 24);
        System.out.println("Person name is: " + person.name);
        System.out.println("Person age is: " + person.age);

        /**
         * Creating a Car object.
         * - This uses the no-argument (default) constructor.
         * - Since no values are provided, fields keep their default values
         *   or values defined inside the class.
         */
        Car car = new Car();
        car.printInfo();

        /**
         * Demonstrating constructor overloading with the Coordinates class.
         * - First, we call the no-argument constructor (default values are used).
         */
        Coordinates coordinates = new Coordinates();
        coordinates.printInfo();

        /**
         * - Then, we call the parameterized constructor, passing custom x and y values.
         */
        Coordinates coordinates1 = new Coordinates(1, 2);
        coordinates1.printInfo();

        /**
         * Demonstrating constructor chaining with the Rectangle class.
         * - First, we call the no-argument constructor, which internally
         *   calls the parameterized constructor with default values (0, 0).
         */
        Rectangle rectangle = new Rectangle();
        rectangle.printInfo();

        /**
         * - Then, we call the parameterized constructor, passing width and height values directly.
         */
        Rectangle rectangle1 = new Rectangle(6, 3);
        rectangle1.printInfo();
    }

}
