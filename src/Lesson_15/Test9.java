package Lesson_15;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;

        do{
            int minute = 0;

            while (minute <= 59) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        }
        while (hour <= 23);
    }
}
