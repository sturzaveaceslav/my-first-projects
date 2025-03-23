package homework.lesson10;
/*Creează o clasă SavingsAccount (Cont de economii). Folosește un modificator static pentru a declara variabila annualInterestRate (rata anuală a dobânzii), care va fi
 valabilă pentru toți titularii de conturi. Fiecare obiect al clasei va conține o variabilă privată savingsBalance (soldul contului de economii), care reprezintă suma
 pe care o are titularul de cont în depozit.
     •	O metodă finală numită calculateMonthlyInterest va calcula dobânda lunară prin înmulțirea soldului savingsBalance cu annualInterestRate împărțit la 12.
        Această dobândă va fi adăugată la savingsBalance.
•	O metodă statică numită modifyInterestRate va modifica valoarea statică a variabilei annualInterestRate, actualizând-o la o valoare nouă.
*/


public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;

    }

    public final void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(0.04); // 4%
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Sold Saver1 : " + saver1.getSavingsBalance());
        System.out.println("Sold Saver2 : " + saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05); // aplied 5%
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Sold updated Saver1 : " + saver1.getSavingsBalance());
        System.out.println("Sold updated Saver2 : " + saver2.getSavingsBalance());
    }


}
