package oop.objects.accessmodifiers.main;

import oop.objects.accessmodifiers.StudentDefault;
import oop.objects.accessmodifiers.StudentPrivate;
import oop.objects.accessmodifiers.StudentPublic;

public class Main {
    public static void main(String[] args) {

        // Creating an object with public access modifier.
        // Since 'id' and 'displayId()' are public in StudentPublic,
        // they can be accessed from anywhere (any package, any class).
        StudentPublic student = new StudentPublic();
        student.id = 1001;           // Direct access is allowed because 'id' is public
        student.displayId();         // Method call is allowed because 'displayId()' is public


        // Creating an object with private access modifier.
        // The StudentPrivate object can be instantiated here,
        // BUT its private fields and methods ('id' and 'displayId()')
        // cannot be accessed outside of the StudentPrivate class itself.
        // That's why the following lines would cause compiler errors.
        StudentPrivate student2 = new StudentPrivate();
        // student2.id = 1001;       //  Not allowed, 'id' is private
        // student2.displayId();     //  Not allowed, 'displayId()' is private


        // Creating an object with default (package-private) access modifier.
        // The StudentDefault object can be instantiated from anywhere,
        // BUT its members with default access ('age' and 'printAge()')
        // are only accessible if this main class is in the same package as StudentDefault.
        // If called from a different package, these members are not accessible.
        StudentDefault student3 = new StudentDefault();
        // student3.age = 12;        //  Not accessible if this class is in another package
        // student3.printAge();      //  Not accessible if this class is in another package
    }

}
