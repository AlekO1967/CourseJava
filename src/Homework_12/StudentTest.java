package Homework_12;

import Lesson_11.Student;

public class StudentTest {
    public static void studentComparison(Student a1, Student a2) {
        if(a1.name.equals(a2.name) && a1.course == a2.course && a1.grade == a2.grade) {
            System.out.println("Students are equal.");
        } else {
            System.out.println("Students aren't equal.");
        }
    }

    public static void studentNestedComparison(Student b1, Student b2) {
        if(b1.name.equals(b2.name)) {
            if(b1.course == b2.course) {
                if(b1.grade == b2.grade) {
                    System.out.println("Students, courses and grades are equal.");
                } else {
                    System.out.println("Students and courses are equal, but grades aren't equal.");
                }
            } else {
                System.out.println("Students are equal, but courses and grades aren't equal.");
            }
        } else {
            System.out.println("Students aren't equal.");
        }
    }
}
