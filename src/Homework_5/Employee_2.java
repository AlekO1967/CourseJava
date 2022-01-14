package Homework_5;

public class Employee_2 {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee_2(int id2, String sn, int a, double s, String d ) {
        id = id2;
        surname = sn;
        age = a;
        salary = s;
        department = d;
    }

    void uvelichenieZarplaty() {
        salary *= 2;
        System.out.println("Заработная плата " + surname + " " + "увеличена вдвое " + salary);
    }
}

class Employee_2Test{
    public static void main(String[] args) {
        Employee_2 emp1 = new Employee_2(123, "Ivanov", 35, 1896.9, "Sale");
        Employee_2 emp2 = new Employee_2(234,"Osipov", 55, 2500.6, "Testing");
        emp1.uvelichenieZarplaty();
        emp2.uvelichenieZarplaty();
    }
}
