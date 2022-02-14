package Lesson_15;

public class Casino {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ваши ставки.");
            System.out.println("Вы проиграли!");
            money = money - 10;
        }
    }
}
