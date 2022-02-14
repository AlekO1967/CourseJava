package Lesson_15;

public class Test12 {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 59; hour++) {
            int minute = 0;
            while (minute <= 59) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}
