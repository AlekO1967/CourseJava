package Lesson_14;

public class Test8 {
    public void clock() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Outer loop started.");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                if (minute == 10) {
                    break;
                }
                INNER_1:
                for (int second = 0; second <= 59; second++) {
                    if (second == 10) {
                        continue OUTER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
            System.out.println("Outer loop finished.");
        }
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        t.clock();
    }
}
