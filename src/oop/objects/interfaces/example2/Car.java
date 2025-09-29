package oop.objects.interfaces.example2;

// for implement an interface we use 'implements' keyword following with the interface name

public class Car implements Driveable{
    public int speed;
     @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}
