package oop.objects.carexercise;

public class Main {

    public static Car createCar() {
        // TODO: Create a new Car object, set its variables, and return it
        Car car = new Car();
        car.modelYear = 2024;
        car.modelName = "Tesla Model S";
        return car;
    }

    public static int getModelYear(Car car) {
        // TODO: return the model year of the car
        return car.modelYear;
    }

    public static String getModelName(Car car) {
        // TODO: return the model name of the car
        return car.modelName;
    }

    public static void honk(Car car) {
        // TODO: call the honk method on the car object
        car.honk();
    }
}

