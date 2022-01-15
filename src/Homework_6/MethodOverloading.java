package Homework_6;

public class MethodOverloading {

    int summ() {
        int result = 0;
        return result;
    }

    int summ(int i1) {
        int result = i1;
        return i1;
    }

    int summ(int i1, int i2) {
        return i1 + i2;
    }

    int summ(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    int summ(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        System.out.println("Сумма равна: " + mO.summ());
        System.out.println("Сумма равна: " + mO.summ(10));
        System.out.println("Сумма равна: " + mO.summ(10, 20));
        System.out.println("Сумма равна: " + mO.summ(10, 20, 30));
        System.out.println("Сумма равна: " + mO.summ(10, 20, 30, 40));
    }
}
