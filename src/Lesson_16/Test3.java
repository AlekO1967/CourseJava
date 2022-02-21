package Lesson_16;

public class Test3 {
    public static void main(String[] args) {
        String a = "B ";
        a = a.concat("U ");
        String b = "L ";
        a = a.concat(b);
        a.replace('U', 'A'); // эта строка не сработает, потому что отсутствует переменная на которую указывает этот объект.
        a = a.concat(b);
        System.out.println(a);
    }
}
