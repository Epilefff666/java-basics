package oop.objects.interfaces.example5;

public class DomesticDog implements Domestic{
    @Override
    public void beFriendly() {
        System.out.println("I'm friendly Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void goHome() {
        System.out.println("Going Home");
    }
}
