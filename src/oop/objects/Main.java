package oop.objects;

public class Main {

    public static void main(String[] args) {

        // --- Using the Person class ---
        // Each new Person() creates a separate object in memory with its own fields
        Person person1 = new Person();
        Person person2 = new Person();

        // Setting values (directly accessing fields for simplicity)
        person1.name = "Ariel";
        person1.age = 21;

        person2.name = "Jane";
        person2.age = 25;

        // Printing field values of each Person object
        System.out.println("Person1 name is " + person1.name);
        System.out.println("Person2 name is " + person2.name);


        // --- Using the Dog class ---
        // Creating a Dog object and setting its fields
        Dog myDog = new Dog();
        myDog.breed = "Labrador";
        myDog.age = 3;

        // Calling a method on the object
        myDog.bark();


        // --- Using the Car class and object references ---
        // Create a Car object and set its fields
        Car myCar = new Car();
        myCar.modelName = "Mustang";
        myCar.modelYear = 1969;

        // Assigning the reference of myCar to anotherCar
        // Both variables now point to the SAME object in memory
        Car anotherCar = myCar;

        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);

        // --- Reassigning the myCar reference ---
        // Here we create a NEW Car object and reassign myCar to it.
        // anotherCar still points to the original "Mustang" object,
        // while myCar now points to the new "Camaro" object.
        myCar = new Car();
        myCar.modelYear = 2010;
        myCar.modelName = "Camaro";

        System.out.println("myCar modelName: " + myCar.modelName);
        System.out.println("myCar modelYear: " + myCar.modelYear);
        System.out.println("anotherCar modelName: " + anotherCar.modelName);
        System.out.println("anotherCar modelYear: " + anotherCar.modelYear);
    }


}
