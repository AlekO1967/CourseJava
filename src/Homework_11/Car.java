package Homework_11;

public class Car {
    public String color;
    public String engine;
    public int doors;

    Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {

    public static void changeDoorsCount(Car c, int doors) {
        c.doors = doors;
    }

    public static void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V4", 2);
        Car car2 = new Car("grey", "V8", 5);
        changeDoorsCount(car1, 3);
        changeColor(car1, car2);
        System.out.println("Car color is: " + car1.color + ". Engine is: " + car1.engine + ". Number of doors " + car1.doors);
        System.out.println("Car color is: " + car2.color + ". Engine is: " + car2.engine + ". Number of doors " + car2.doors);
    }
}
