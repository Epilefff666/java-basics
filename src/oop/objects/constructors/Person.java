package oop.objects.constructors;

public class Person {

    // Instance variables (fields) to store data for each object
    String name;
    int age;

    /**
     * Parameterized constructor of the Person class.
     * - A constructor that accepts parameters is called a parameterized constructor.
     * - It allows creating a Person object with specific values instead of relying on defaults.
     * - The parameters (name, age) are used to initialize the object's fields.
     */
    public Person(String name, int age) {
        // "this" refers to the current object's fields.
        // It resolves ambiguity when parameter names are the same as instance variable names.
        this.name = name;
        this.age = age;
    }
}
