package Lesson_5;

public class Car1 {
    Car1(String cvet, String motor) {
        color = cvet;
        engine = motor;

    }
    String color;
    String engine;
}

class Car1Test {
    public static void main(String[] args) {
        Car1 car = new Car1("красный", "V6");
        System.out.println("Цвет машины: " + car.color);
        System.out.println("Мотор машины: " + car.engine);
    }
}
