package Lesson_17;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        System.out.println(sb2.insert(sb2.length(), " Hello!"));
        StringBuilder sb3 = new StringBuilder("Hello World!");
        System.out.println(sb3.delete(0, 5)); // метод удаляет символы которые находятся в пределах аргументов указанных в параметрах.
        System.out.println(sb3.deleteCharAt(0)); // метод удаляет символ аргумент которого указан в параметре метода.
        sb3.reverse(); // метод переворачивает StringBuilder.
        System.out.println(sb3); // !dlroW
        StringBuilder sb4 = new StringBuilder("Vsem privet");
        sb4.replace(0, 4, "Vase"); // метод изменяет символы в пределах аргументов параметра,
                                                // причём конечный аргумент не включается в замену
        System.out.println(sb4); // Vase privet
        System.out.println(sb4.capacity()); // метод выводит количество символов в StringBuilder - 27 символов в sb4.
    }
}
