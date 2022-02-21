package Lesson_16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("abcdefgabcd");
        String s3 = new String(    "abcdefg   abcd"    );
        System.out.println(s3.trim()); // метод убирает пробелы в начале и в конце строки, внутри строки пробелы остаются
        System.out.println(s1.replace('H', 'h'));
        System.out.println(s1);
        System.out.println(s1.replace("Hello", "HELLO"));
    }
}
