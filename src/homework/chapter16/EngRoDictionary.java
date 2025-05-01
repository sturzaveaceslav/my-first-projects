import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngRoDictionary {
    public static void main(String[] args) {
        // 1. Crearea dicționarului
        Map<String, String> dictionar = new HashMap<>();

        // 2. Adăugarea a 5 perechi de cuvinte
        dictionar.put("apple", "măr");
        dictionar.put("book", "carte");
        dictionar.put("sun", "soare");
        dictionar.put("water", "apă");
        dictionar.put("house", "casă");

        // 3. Întreabă utilizatorul un cuvânt
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu un cuvânt în engleză: ");
        String cuvant = scanner.nextLine().toLowerCase();

        // 4. Afișează traducerea dacă există
        if (dictionar.containsKey(cuvant)) {
            System.out.println("Traducere: " + dictionar.get(cuvant));
        } else {
            // 5. Dacă nu există
            System.out.println("❌ Cuvântul \"" + cuvant + "\" nu este în dicționar.");
        }

        scanner.close();
    }
}
