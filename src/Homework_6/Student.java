package Homework_6;

public class Student {
    int studentID;
    String name;
    String surname;
    int course;
    double averageMarkOfMath;
    double averageMarkOfEconomy;
    double averageMarkOfForeignLang;

    Student(int id2, String name2, String surname2, int course2, double averageMarkOfMath2, double averageMarkOfEconomy2,
            double averageMarkOfForeignLang2) {
        studentID = id2;
        name = name2;
        surname = surname2;
        course = course2;
        averageMarkOfMath = averageMarkOfMath2;
        averageMarkOfEconomy = averageMarkOfEconomy2;
        averageMarkOfForeignLang = averageMarkOfForeignLang2;
    }

    Student(int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0, 0, 0 );
    }

    Student() {

    }
}

class StudentTest {
    void sredniyaArifmOcenka(Student st) {
        double averageGrade = (st.averageMarkOfMath + st.averageMarkOfEconomy + st.averageMarkOfForeignLang) / 3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + " " + averageGrade);
    }
    public static void main(String[] args) {
    Student st1 = new Student();
        st1.studentID = 256;
        st1.name = "Nikolai";
        st1.surname = "Petrov";
        st1.course = 2;
        st1.averageMarkOfMath = 9.56;
        st1.averageMarkOfEconomy = 8.55;
        st1.averageMarkOfForeignLang = 8.99;

        Student st2 = new Student(340, "Sergei", "Petrov", 1, 8.34, 9.15, 9.66);

        Student st3 = new Student(133, "Anton", "Ivanov", 3);
        st3.averageMarkOfMath = 9.44;
        st3.averageMarkOfEconomy = 9.88;
        st3.averageMarkOfForeignLang = 9.56;

        StudentTest st = new StudentTest();
        st.sredniyaArifmOcenka(st1);
        st.sredniyaArifmOcenka(st2);
        st.sredniyaArifmOcenka(st3);
    }
}
