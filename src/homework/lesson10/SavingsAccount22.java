package homework.lesson10;

/*Scrie un program care să testeze clasa SavingsAccount. Instanțiază două obiecte de tip SavingsAccount, saver1 și saver2, cu solduri de $2000.00 și,
respectiv, $3000.00. Setează annualInterestRate la 4%, calculează dobânda lunară și afișează noile solduri pentru ambii economisitori. Apoi, setează
annualInterestRate la 5%, calculează dobânda lunară pentru luna următoare și afișează noile solduri pentru ambii economisitori.
Detalii suplimentare:
        •	Folosește modificatorul private pentru a ascunde variabila savingsBalance de la accesul din afara clasei.
•	Modificatorul public va fi folosit pentru metodele care vor fi accesibile din afară, cum ar fi calculateMonthlyInterest și modifyInterestRate.
        •	annualInterestRate va fi static pentru a fi accesibil la nivelul clasei și nu la nivelul fiecărui obiect în parte.
•	calculateMonthlyInterest va fi finală pentru a preveni suprascrierea acestei metode în eventualele clase derivate, dacă ar exista vreo nevoie de extindere a clasei.
        •	Adaugă un constructor pentru inițializarea soldului la crearea obiectului.
*/

public class SavingsAccount22 {
    private double savingsBalance;
    private static double annualInterestRate;
    public SavingsAccount22(double initialBalance) {
        savingsBalance = initialBalance;
    }
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
    public final void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;  // actualizează soldul economiilor
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
}
 class TestSavingsAccount {
    public static void main(String[] args) {
        // Crearea a două obiecte SavingsAccount
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Setăm rata dobânzii anuale la 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculăm dobânda lunară și afișăm noile solduri
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Soldul saver1 după dobânda lunară (4%): " + saver1.getSavingsBalance());
        System.out.println("Soldul saver2 după dobânda lunară (4%): " + saver2.getSavingsBalance());

        // Setăm rata dobânzii anuale la 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculăm dobânda lunară pentru luna următoare și afișăm noile solduri
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Soldul saver1 după dobânda lunară (5%): " + saver1.getSavingsBalance());
        System.out.println("Soldul saver2 după dobânda lunară (5%): " + saver2.getSavingsBalance());
    }
}