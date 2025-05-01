import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Citește cuvântul
        System.out.print("Introdu un cuvânt: ");
        String original = scanner.nextLine();

        // 2. Inversare cu StringBuilder
        String reversed = new StringBuilder(original).reverse().toString();

        // 3. Comparare ignorând majusculele
        boolean estePalindrom = original.equalsIgnoreCase(reversed);

        // 4. Afișare rezultat
        System.out.println("Cuvântul este palindrom: " + estePalindrom);

        scanner.close();
    }
}
