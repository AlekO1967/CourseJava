package Lesson_14;

public class Test7 {
    public static void main(String[] args) { //break, continue
        for(int i = 1; i <= 20; i++) {
            if(i == 10) {
                continue;
            }
            if(i%15 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
