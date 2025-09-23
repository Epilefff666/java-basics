package oop.objects.accessmodifiers;

public class StudentDefault {

    // Field with default (package-private) access modifier.
    // This means 'age' can be accessed only within the same package.
    // If no explicit modifier is provided (public, private, protected),
    // Java automatically applies the default (also called package-private) level.
    int age;

    // Method with default (package-private) access modifier.
    // This method can also be accessed only within the same package.
    // It prints the current value of the 'age' field to the console.
    void printAge() {
        System.out.println("Age: " + age);
    }


}
