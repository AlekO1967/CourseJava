package Lesson_17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // по умолчанию, вместимость объекта составляет 16 символов, т.е. объект
                                                 // состоит из массива, который вмещает в себя символов.
        StringBuilder sb2 = new StringBuilder("Good Day!!!"); // вместимость данного объекта 11 + 16 = 27 символов.
        StringBuilder sb3 = new StringBuilder(50); // вместимость объекта 50 символов
        StringBuilder sb4 = new StringBuilder(sb2); // в качестве параметра может использоваться StringBuilder.

        System.out.println(sb2.length()); // метод выводит длину String-а. В данном примере длина String-a = 11 символов.
        System.out.println(sb2.charAt(5)); // метод выводит значение символа аргумент которого указанного в параметре метода, - "D".
        System.out.println(sb2.indexOf("D")); //метод так же как и в методе String показывает аргумент символа значение
                                              // которого указано в параметре. Параметр записывается, как String в " ", - 5.
        System.out.println(sb2.indexOf("o", 2));
        String s = sb2.substring(5); //метод выводит String начиная с символа, аргумент которого указан в параметре метода - "Day!!!".
        System.out.println(s);
        String s2 = sb2.substring(5, 8); // метод выводит String, символы которого лежат в диапазоне аргументов указанных
                                         // в параметре метода, но выводится символ индекс которого равен n - 1, - "Day".
        System.out.println(s2);
        System.out.println(sb2.subSequence(5, 8)); // метод работает так же как substring, но выводит последовательность символов - "Day".
        sb2.append(55);// метод изменяет сам StringBuilder, т.е. добавляет к исходному StringBuilder значение аргумента метода.
        System.out.println(sb2); // Good Day!!!55
        sb2.append(true);
        System.out.println(sb2); // Good Day!!!55true
        sb2.append("Hello!");
        System.out.println(sb2); // Good Day!!!55trueHello!
        sb2.insert(4, "_"); // метод вставляет на определённую позицию какой-либо символ указанный в параметре метода.
        System.out.println(sb2); // Good_ Day!!!55trueHello!

    }
}
