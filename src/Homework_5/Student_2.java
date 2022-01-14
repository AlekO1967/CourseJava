package Homework_5;

public class Student_2 {
    int studentID;
    String name;
    String surname;
    int course;
    double averageMarkOfMath;
    double averageMarkOfEconomy;
    double averageMarkOfForeignLang;
}

class Student_2Test {
    double sredniyaOcenka(Student st) {
        double averageGrade = (st.averageMarkOfMath + st.averageMarkOfEconomy + st.averageMarkOfForeignLang) / 3;
        return averageGrade;
        }

    public static void main(String[] args) {
        Student_2Test st = new Student_2Test();
        Student st1 = new Student();
        st1.studentID = 256;
        st1.name = "Nikolai";
        st1.surname = "Petrov";
        st1.course = 2;
        st1.averageMarkOfMath = 9.56;
        st1.averageMarkOfEconomy = 8.55;
        st1.averageMarkOfForeignLang = 8.99;
        System.out.println("Средняя оценка студента " + st1.name + " " + st1.surname + " " + st.sredniyaOcenka(st1));

        Student st2 = new Student();
        st2.studentID = 340;
        st2.name = "Sergei";
        st2.surname = "Vasiliev";
        st2.course = 1;
        st2.averageMarkOfMath = 8.34;
        st2.averageMarkOfEconomy = 9.15;
        st2.averageMarkOfForeignLang = 9.66;
        System.out.println("Средняя оценка студента " + st2.name + " " + st2.surname + " " + st.sredniyaOcenka(st2));

        Student st3 = new Student();
        st3.studentID = 133;
        st3.name = "Anton";
        st3.surname = "Ivanov";
        st3.course = 3;
        st3.averageMarkOfMath = 9.44;
        st3.averageMarkOfEconomy = 9.88;
        st3.averageMarkOfForeignLang = 9.56;
        System.out.println("Средняя оценка студента " + st3.name + " " + st3.surname + " " + st.sredniyaOcenka(st3));
    }
}
