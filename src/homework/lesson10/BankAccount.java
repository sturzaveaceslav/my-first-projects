package homework.lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public BankAccount() {
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            boolean add = transactionHistory.add("Depunere: +" + amount + " LEI. Sold nou: " + balance + " LEI.");
            System.out.println("✅ Depunere reușită: " + amount + " LEI.");
        } else {
            System.out.println("❌ Suma trebuie să fie pozitivă!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Retragere: -" + amount + " LEI. Sold rămas: " + balance + " LEI.");
            System.out.println("✅ Retragere reușită: " + amount + " LEI.");
        } else if (amount > balance) {
            System.out.println("❌ Fonduri insuficiente! Sold disponibil: " + balance + " LEI.");
        } else {
            System.out.println("❌ Suma trebuie să fie pozitivă!");
        }
    }

    public boolean transfer(BankAccount destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
            transactionHistory.add("Transfer către contul " + destinationAccount.getAccountNumber() + ": -" + amount + " LEI.");
            destinationAccount.getTransactionHistory().add("Transfer primit de la contul " + this.accountNumber + ": +" + amount + " LEI.");
            return true;
        } else {
            System.out.println("❌ Transfer eșuat: fonduri insuficiente!");
            return false;
        }
    }

    public void printTransactionHistory() {
        System.out.println("\n📜 Istoric tranzacții pentru contul " + accountNumber + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
