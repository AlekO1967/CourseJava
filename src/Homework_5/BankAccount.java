package Homework_5;

public class BankAccount {

    int id = 7;
    String name = "Aleksandr";
    double balance = 100;

    void popolnenieScheta(double summaPopolnenia) {
        System.out.println("Остаток средств на счёте: " + balance);
        System.out.println("Сумма пополнения счёта: " + summaPopolnenia);
        balance += summaPopolnenia;
        System.out.println("Остаток средст на счёте: " + balance);
        System.out.println();
    }

    void snyatieSoScheta(double summaSnyatia) {
        System.out.println("Остаток средств на счёте: " + balance);
        System.out.println("Сумма снятия со счёта: " + summaSnyatia);
        balance -= summaSnyatia;
        System.out.println("Остаток средств на счёте: " + balance);
        System.out.println();;
    }
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.popolnenieScheta(35.50);
        bA.snyatieSoScheta(48.90);
    }
}
