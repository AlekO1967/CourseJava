package Homework_5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String sn, int a, double s, String d) {
        int id = id2;
        surname = sn;
        age = a;
        salary = s;
        department = d;
    }

    double uvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
    Employee em1 = new Employee(123, "Ivanov", 34, 1856.7, "Law");
    Employee em2 = new Employee(235, "Krasnov", 39, 2366.7, "IT");
        System.out.println("Заработная плата " + em1.surname + " увеличена вдвое " + em1.uvelichenieZarplati());
        System.out.println("Заработная плата " + em2.surname + " увеличенв вдвое " + em2.uvelichenieZarplati());
    }


}
