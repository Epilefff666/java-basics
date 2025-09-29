package oop.objects.interfaces.example2;

public class Main {
    public static void main(String[] args) {
        //then we can create a new object based in an interface implemented in a class
        Driveable driveable = new Car();
        driveable.start();
        driveable.stop();

    }
}
