package oop.objects.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the StudentDefault class.
        // The StudentDefault class and this main class are in the same package.
        // Because of this, members (fields and methods) with default access can be accessed here.
        StudentDefault student3 = new StudentDefault();

        // Accessing the 'age' field with default (package-private) access.
        // This works because both classes are in the same package.
        student3.age = 12;

        // Calling the 'printAge()' method, which also has default access.
        // Since we are in the same package, the method is accessible.
        student3.printAge();

    }
}
