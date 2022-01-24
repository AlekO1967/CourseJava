package Homework_8;

public class NumberPi {
    public static final double pi = 3.14;

    public double areaOfCircle(double r) {
        double s = pi * r * r;
        return s;
    }

    public static double circumference(double r) {
        double l = 2 * pi * r;
        return l;
    }

    public void showInfo(double r) {
        System.out.println("Радиус окружности равен: " + r);
        System.out.println("Площадь круга равна: " + areaOfCircle(r));
        System.out.println("Длина окружности равна: " + circumference(r));
    }
}

class NumberPiTest{
    public static void main(String[] args) {
        NumberPi np = new NumberPi();
        System.out.println("Площадь круга S = " + np.areaOfCircle(3));
        System.out.println("Длина окружности L = " + NumberPi.circumference(4));
        np.showInfo(5);
    }
}

