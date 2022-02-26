package Homework_16;

public class MailDoWhile {
    static void email(String str) {
        int a; // индекс символа '@'
        int b; // индекс символа '.'
        int i = 0; // индекс символа ';'
        do {
            i++;
            a = (str.indexOf('@', i)) + 1;
            b = str.indexOf('.', i);
            i = str.indexOf(';', i);
            System.out.println(str.substring(a, b));
        }
        while (i < str.length() - 1);
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
