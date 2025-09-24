package oop.objects.accessmodifiers.gettersetters;

public class Person {
    // Fields are marked private to apply encapsulation.
    // They cannot be accessed directly outside this class.
    private String name;
    private int age;

    // Getter for 'age'
    // Provides controlled read-only access to the private field 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    // Provides controlled write access to the private field 'age'
    // Includes a validation rule: age must be non-negative
    public void setAge(int age) {
        if (age >= 0) {  // Ensures invalid values are not stored
            this.age = age;
        }
    }

    // Getter for 'name'
    // Allows external code to retrieve the value of 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    // Allows external code to update the value of 'name'
    public void setName(String name) {
        this.name = name;
    }
}

