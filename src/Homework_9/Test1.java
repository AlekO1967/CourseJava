package Homework_9;

public class Test1 {
    int a = 1;
    //static int a = 2; нельзя создавать переменные с одинаковым идентификатором.

    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc(3);
    }
}
