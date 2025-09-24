package oop.objects.accessmodifiers.gettersetters;

public class Main {
    public static void main(String[] args) {
        // Create a new Person object using the default constructor
        Person person = new Person();

        // Use the setter method to assign a name to the person
        // Direct access is not possible since 'name' is private
        person.setName("John Doe");

        // Use the setter method to assign an age to the person
        // The setter applies validation (age must be >= 0)
        person.setAge(20);

        // Use the getter method to retrieve the value of 'name'
        // and print it to the console
        System.out.println("Name: " + person.getName());

        // Use the getter method to retrieve the value of 'age'
        // and print it to the console
        System.out.println("Age: " + person.getAge());
    }
}

