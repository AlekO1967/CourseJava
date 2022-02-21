package Homework_16;

public class MailWhileLoop {

    static void email(String str) {
        int a; // индекс символа '@'
        int b; // индекс символа '.'
        int i = 0; // индекс символа ';'
        while (i < str.length()) {
            a = (str.indexOf('@', i)) + 1;
            b = str.indexOf('.', i);
            i = str.indexOf(';', i);
            System.out.println(str.substring(a, b));
            i++;
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
