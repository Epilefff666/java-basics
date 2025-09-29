package oop.objects.interfaces.example3;

// a class can have multiple implements in this case we are implementing Drawable and Movable interfaces
public class Rectangle  implements Drawable,Movable{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
    @Override
    public void move() {
        System.out.println("Moving a rectangle");
    }
}
