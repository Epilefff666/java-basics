package oop.objects.interfaces.example4;

public class Dog implements Mammal{
    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
