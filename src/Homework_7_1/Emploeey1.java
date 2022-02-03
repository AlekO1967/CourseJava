
package Homework_7_1;

import Homework_7.Employee;
//Переменная private salary видна только в пределах класса Employee, в пределах пакета её не видно, в классе EmployeeNewClass
// переменная private salary не видна.
// Переменная int id с дефолтным модификатором доступа видна только в пределах пакета Lesson_7, в пакете Lesson_7_1
// переменная int id с дефолтным модификатором доступа не видна.
class Employee1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(234);
//        Employee emp2 = new Employee("Ivanov");
//        Employee emp3 = new Employee(3456.78);

        emp1.surname = "Petrov";
//        emp1.salary = 2345.67;
//        System.out.println("Идентификационный номер работника: " + emp1.id + "." + " Строка выведена методом println.");
        System.out.println("Фамилия работника: " + emp1.surname + "." + " Строка выведена методом println.");
//        System.out.println("Заработная плата работника: " + emp1.salary + "." + " Строка выведена методом println.");
        System.out.println();
        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();

//        emp2.id = 567;
//        emp2.salary = 2345.9;
//        System.out.println("Идентификационный номер работника: " + emp2.id + "." + " Строка выведена методом println.");
//        System.out.println("Фамилия работника: " + emp2.surname + "." + " Строка выведена методом println.");
//        System.out.println("Заработная плата работника: " + emp2.salary + "." + " Строка выведена методом println.");
//        System.out.println();
//        emp2.getId();
//        emp2.getSurname();
//        emp2.getSalary();
//        System.out.println();
//
//        emp3.id = 890;
//        emp3.surname = "Vasiliev";
//        System.out.println("Идентификационный номер работника: " + emp3.id + "." + " Строка выведена методом println.");
//        System.out.println("Фамилия работника: " + emp3.surname + "." + " Строка выведена методом println.");
//        System.out.println("Заработная плата работника: " + emp3.salary + "." + " Строка выведена методом println.");
//        System.out.println();
//        emp3.getId();
//        emp3.getSurname();
//        emp3.getSalary();
//        System.out.println();
    }
}

