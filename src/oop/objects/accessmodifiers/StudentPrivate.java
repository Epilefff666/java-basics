package oop.objects.accessmodifiers;

public class StudentPrivate {

    // Field with the private access modifier.
    // 'id' can only be accessed within this class.
    // It is completely hidden from other classes, even if they are in the same package.
    // To allow controlled access, getters and setters are usually provided.
    private int id;

    // Method with the private access modifier.
    // 'displayId()' can only be called inside this class.
    // Other classes, even in the same package, cannot directly call this method.
    private void displayId() {
        System.out.println("id: " + id);
    }

}
