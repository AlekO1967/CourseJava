package Lesson_15;

public class TestCasino {
    public static void main(String[] args) {
        int money = 0;
        do {
            System.out.println("Делайте ставки.");
            System.out.println("Вы проиграли!");
            money -= 10;
        }
        while (money > 50);
    }
}
// цикл do while, как минимум один раз заходит в тело цикла и выполняет код записанный в теле цикла.