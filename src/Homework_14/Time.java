package Homework_14;

public class Time {
    static void clock() {
        for (int hour = 0; hour < 6; hour++) {

            for (int minute = 0; minute <= 59; minute++) {
                if ((hour > 1) && (minute % 10 == 0)) {
                    break;
                }

                for (int second = 0; second <= 59; second++) {
                    if (hour * second > minute) {
                        continue;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        clock();
    }
}
