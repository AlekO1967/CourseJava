package Lesson_5;

public class Methods {
    double summ(double a, double b, double c) {
        double result = (a + b + c) / 3;
        return result;
    }
}

class MethodsTest{
    public static void main(String[] args) {
        Methods m1 = new Methods();
        System.out.println(m1.summ(20, 43, 77));
    }
}
