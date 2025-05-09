import java.util.Scanner;

public class EventRegistrationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduceți numele complet: ");
            String nume = scanner.nextLine();


            System.out.print("Introduceți vârsta: ");
            int varsta = Integer.parseInt(scanner.nextLine());
            if (varsta < 14) {
                throw new TooYoungException(" Trebuie să ai cel puțin 14 ani pentru a te înscrie.");
            }


            System.out.print("Introduceți email-ul: ");
            String email = scanner.nextLine();
            if (!email.contains("@")) {
                throw new InvalidEmailException(" Email-ul trebuie să conțină caracterul '@'.");
            }

            // Dacă totul e ok
            System.out.println(" Felicitări, " + nume + "! Te-ai înscris cu succes la eveniment.");

        } catch (TooYoungException | InvalidEmailException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Vârsta introdusă nu este validă. Introdu un număr întreg.");

        } catch (Exception e) {
            System.out.println("A apărut o eroare neașteptată: " + e.getMessage());
        }

        scanner.close();
    }
}
