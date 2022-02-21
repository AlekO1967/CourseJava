package Homework_16;

public class MailForLoop {
    static void email(String str) {
        int a; // индекс символа '@'
        int b; // индекс символа '.'
        int i; // индекс символа ';'
        for(i = 0; i < str.length(); i++) {
            a = (str.indexOf('@', i)) + 1;
            b = str.indexOf('.', i);
            i = str.indexOf(';', i);
            System.out.println(str.substring(a, b));
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
