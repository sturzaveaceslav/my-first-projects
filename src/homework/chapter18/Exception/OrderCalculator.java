import java.util.Scanner;

public class OrderCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Numele produsului
            System.out.print("Introduceți numele produsului: ");
            String numeProdus = scanner.nextLine();

            // Cantitatea
            System.out.print("Introduceți cantitatea: ");
            int cantitate = Integer.parseInt(scanner.nextLine());
            if (cantitate < 0) {
                throw new InvalidValueException("❌ Cantitatea nu poate fi negativă!");
            }

            // Prețul per unitate
            System.out.print("Introduceți prețul per unitate: ");
            double pretUnitate = Double.parseDouble(scanner.nextLine());
            if (pretUnitate < 0) {
                throw new InvalidValueException("❌ Prețul nu poate fi negativ!");
            }

            // Calcul și afișare
            double total = cantitate * pretUnitate;
            System.out.printf("✅ Comanda: %s × %d = %.2f lei\n", numeProdus, cantitate, total);

        } catch (InvalidValueException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("⚠️ Eroare: Introduceți un număr valid pentru cantitate și preț!");

        } catch (Exception e) {
            System.out.println("⚠️ Eroare neașteptată: " + e.getMessage());
        }

        scanner.close();
    }
}
