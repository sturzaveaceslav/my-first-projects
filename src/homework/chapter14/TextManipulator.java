import java.util.Scanner;

public class TextManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Citire propoziție
        System.out.print("Introdu o propoziție: ");
        String propozitie = scanner.nextLine();

        // 2. Majuscule
        System.out.println("\n Propoziția în MAJUSCULE:");
        System.out.println(propozitie.toUpperCase());

        // 3. Înlocuire "Java" cu "Python"
        String inlocuita = propozitie.replace("Java", "Python");
        System.out.println("\n După înlocuire 'Java' → 'Python':");
        System.out.println(inlocuita);

        // 4. Verificări
        boolean incepeCuSalut = propozitie.startsWith("Salut");
        boolean seTerminaCuExclamatie = propozitie.endsWith("!");

        System.out.println("\n Începe cu „Salut”? " + (incepeCuSalut ? "✅ Da" : "❌ Nu"));
        System.out.println(" Se termină cu „!”? " + (seTerminaCuExclamatie ? "✅ Da" : "❌ Nu"));

        scanner.close();
    }
}
