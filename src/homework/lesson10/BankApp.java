package homework.lesson10;

public class BankApp {
    public static void main(String[] args) {
        // Creăm două conturi bancare
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("🔹 Cont 1 creat! Număr cont: " + account1.getAccountNumber());
        System.out.println("🔹 Cont 2 creat! Număr cont: " + account2.getAccountNumber());

        // Depunem bani în contul 1
        account1.deposit(1000);

        // Facem un transfer către contul 2
        account1.transfer(account2, 300);

        // Retragem bani din contul 2
        account2.withdraw(100);

        // Afișăm istoricul tranzacțiilor pentru ambele conturi
        account1.printTransactionHistory();
        account2.printTransactionHistory();
    }
}
