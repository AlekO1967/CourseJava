package Lesson_15;

public class Test10 {
    public static void main(String[] args) {
        int hour = 0;
        do{
            for(int minute = 0; minute <=59; minute++){
                System.out.println(hour + ":" + minute);
            }
            hour++;
        }
        while (hour <= 23);
    }
}
