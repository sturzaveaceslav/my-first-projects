import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {
        Map<String, String> userDatabase = new HashMap<>();
        userDatabase.put("admin", "1234");
        userDatabase.put("user", "user");
        userDatabase.put("slavon", "1234567890");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            try {
                System.out.print("Introduceți numele de utilizator: ");
                String username = scanner.nextLine();

                System.out.print("Introduceți parola: ");
                String password = scanner.nextLine();

                authenticate(username, password, userDatabase);
                System.out.println("✅ Autentificare reușită! Bine ai venit, " + username + "!");
                return;

            } catch (AuthenticationException e) {
                System.out.println("❌ " + e.getMessage());
                attempts++;
                if (attempts < 3) {
                    System.out.println("💡 Mai aveți " + (3 - attempts) + " încercări.\n");
                } else {
                    System.out.println("🔒 Ai epuizat toate cele 3 încercări. Acces blocat.");
                }
            }
        }

        scanner.close();
    }

    public static void authenticate(String username, String password, Map<String, String> database)
            throws AuthenticationException {
        if (!database.containsKey(username)) {
            throw new AuthenticationException("Utilizator inexistent.");
        }
        if (!database.get(username).equals(password)) {
            throw new AuthenticationException("Parolă incorectă.");
        }
    }
}
