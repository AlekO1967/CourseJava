package Lesson_5;

public class Human {
    String name;
    Car4 car;
    BankAccount bA;

    void info() {
        System.out.println("Name " + name + ", color car is " + car.color + ", engine car is " + car.engine +
                ", balance - " + bA.balance + "$");

    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car4("yellow", "V8");
        h.bA = new BankAccount(1, 1000.5);
        h.info();
    }
}

class Car4 {
    Car4(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount (int id1, double balance1) {
        id = id1;
        balance = balance1;
    }
    int id;
    double balance;
}
