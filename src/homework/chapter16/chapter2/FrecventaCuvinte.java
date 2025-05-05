import java.util.*;

public class FrecventaCuvinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un text:");
        String text = scanner.nextLine();

        // Transformăm tot textul în litere mici și eliminăm semnele de punctuație
        text = text.toLowerCase().replaceAll("[^a-zăîâșț0-9 ]", "");

        String[] cuvinte = text.split("\\s+");
        Map<String, Integer> frecventa = new HashMap<>();

        for (String cuvant : cuvinte) {
            frecventa.put(cuvant, frecventa.getOrDefault(cuvant, 0) + 1);
        }

        System.out.println("\nFrecvența cuvintelor:");
        for (Map.Entry<String, Integer> entry : frecventa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
