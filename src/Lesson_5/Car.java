package Lesson_5;

public class Car {
    String color;
    String engine;
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "красный";
        car1.engine = "V8";

        System.out.println("Цвет машины: " + car1.color);
        System.out.println("Двигатель машины: " + car1.engine);
    }
}
