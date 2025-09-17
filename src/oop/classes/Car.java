package oop.classes;

public class Car {

    // Fields (or attributes) represent the state of the object.
    // Each Car will have its own number of wheels and a color.
    int wheels;
    String color;
    int speed;
    int gear;

    // Instance initializer block:
    // This block runs every time a new Car object is created,
    // right after the fields are allocated and before the constructor runs.
    {
        wheels = 4;
        color = "red";
    }

    // Methods represent the behavior of the object.
    // This method simulates the car honking.
    void honk() {
        System.out.println("Beep! Beep!");
    }

    void changeGear(int newGear){
        gear = newGear;
    }

    void speedUp(int increment){
        speed = speed+ increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    int getSpeed(){
        return speed;
    }

}
