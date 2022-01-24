package Homework_8;

public class FirstClass {

    static int multiplication(int a, int b, int c) {
        System.out.println("Произведение чисел a, b, c равно: " + a * b * c);
        return a * b * c;
    }

    static void divisionOfNumbers(int a, int b) {
        System.out.println("Частное от деления a / b равно: " + a / b);
        System.out.println("Остаток от деления a / b равно: " + a % b);
    }
}

class FirstClassTest {
    public static void main(String[] args) {
        FirstClass.multiplication(3, 5, 7);
        System.out.println();
        FirstClass.divisionOfNumbers(34, 6);
        System.out.println();
        FirstClass.multiplication(2, 4, 6);
        System.out.println();
        FirstClass.divisionOfNumbers(56, 9);
    }
}
