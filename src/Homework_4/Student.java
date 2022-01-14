package Homework_4;

public class Student {
    int studentIDNumber;
    String name;
    String surname;
    int yearOfStudy;
    double averageMarkOfMath;
    double averageMarkOfEconomy;
    double averageMarkOfForeignLang;
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentIDNumber = 1;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.yearOfStudy = 2019;
        student1.averageMarkOfMath = 9.8;
        student1.averageMarkOfEconomy = 7.4;
        student1.averageMarkOfForeignLang = 8.3;

        student2.studentIDNumber = 2;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.yearOfStudy = 2020;
        student2.averageMarkOfMath = 7.6;
        student2.averageMarkOfEconomy = 8.7;
        student2.averageMarkOfForeignLang = 9.9;

        student3.studentIDNumber = 3;
        student3.name = "Sidor";
        student3.surname = "Sidorov";
        student3.yearOfStudy = 2021;
        student3.averageMarkOfMath = 6.6;
        student3.averageMarkOfEconomy = 7.1;
        student3.averageMarkOfForeignLang = 9.6;

        System.out.println("Average grade of " + student1.name + " " + student1.surname + " " +
                (student1.averageMarkOfMath + student1.averageMarkOfEconomy + student1.averageMarkOfForeignLang) / 3);
        System.out.println("Average grade of " + student2.name + " " + student2.surname + " " +
                (student2.averageMarkOfMath + student2.averageMarkOfEconomy + student2.averageMarkOfForeignLang) / 3);
        System.out.println("Average grade of " + student3.name + " " + student3.surname + " " +
                (student3.averageMarkOfMath + student2.averageMarkOfEconomy + student3.averageMarkOfForeignLang) / 3);
    }
}
