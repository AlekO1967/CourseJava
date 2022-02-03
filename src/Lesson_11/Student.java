package Lesson_11;

import static Homework_12.StudentTest.*;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 8.56);
        Student st2 = new Student("Pavel", 5, 9.4);
        studentComparison(st1, st2);
        studentNestedComparison(st1, st2);
    }
}
