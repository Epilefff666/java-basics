package oop.objects.accessmodifiers;

public class StudentPublic {

    // Field with the public access modifier.
    // 'id' can be accessed directly from any other class in any package.
    //  Directly exposing fields as public is generally discouraged,
    // because it breaks encapsulation. It's better to keep fields private
    // and use getters/setters to control access.
    public int id;

    // Method with the public access modifier.
    // 'displayId()' can be called from anywhere (inside the same class,
    // from other classes in the same package, or from classes in different packages).
    // This is the most permissive level of access.
    public void displayId() {
        System.out.println("id: " + id);
    }

}
