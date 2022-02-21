package Lesson_16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("abcdefgabcd");
        System.out.println(s1.length()); // метод String выводит длину String-a
        System.out.println(s1.charAt(1)); // метод String выводит символ находящийся на позиции
        System.out.println(s1.indexOf('l')); // метод String выводит номер позиции на которой находится символ
        System.out.println(s1.indexOf("llo")); // метод String выводит номер позиции с которого начинается группа символов
        System.out.println(s2.indexOf('a', 5)); // метод String выводит номер позиции на которой находится символ
                                                            // начиная с указанной позиции
        System.out.println(s2.startsWith("abc"));
        System.out.println(s2.startsWith("abc", 6));
        System.out.println(s2.endsWith("bcd"));
    }
}
