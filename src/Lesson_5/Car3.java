package Lesson_5;

public class Car3 {
    Car3() {
        color = "синий";
        engine = "V12";
    }

    String color;
    String engine;
}

class Car3Test {
    public static void main(String[] args) {
        Car3 car = new Car3();
        Car3 car1 = new Car3();
        car1.color = "красный";
        car1.engine = "V5";
        System.out.println("Цвет машины: " + car.color);
        System.out.println("Мотор машины: " + car.engine);
        System.out.println("Цвет машины: " + car1.color);
        System.out.println("Мотор машины: " + car1.engine);

    }
}
