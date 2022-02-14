package Lesson_15;

public class Test11 {
    public static void main(String[] args) {
        for(int hour = 0; hour <=23; hour++){
            int minute = 0;
            do{
                System.out.println(hour + ":" + minute);
                minute++;
            }
            while (minute <= 59);
        }
    }
}
