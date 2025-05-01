import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numere = new ArrayList<>();

        // 2. Introducere 5 numere
        System.out.println("Introdu 5 numere întregi:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Numărul " + i + ": ");
            int n = scanner.nextInt();
            numere.add(n);
        }

        // 3. Afișare toate numerele
        System.out.println("\nNumerele introduse sunt: " + numere);

        // 4. Câte sunt pare
        long pare = numere.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Numere pare: " + pare);

        // 5. Cel mai mare număr
        int max = numere.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
        System.out.println("Cel mai mare număr: " + max);

        // 6. Verificare existență număr
        System.out.print("\nIntrodu un număr pentru a verifica dacă este în listă: ");
        int cautat = scanner.nextInt();
        if (numere.contains(cautat)) {
            System.out.println("✅ Numărul " + cautat + " se află în listă.");
        } else {
            System.out.println("❌ Numărul " + cautat + " NU se află în listă.");
        }

        scanner.close();
    }
}
