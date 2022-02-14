package Lesson_15;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        boolean b = true;

        while (b) {
            if(a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            System.out.println(a);
            a++;
        }
    }
}
