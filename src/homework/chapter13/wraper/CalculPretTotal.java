import java.util.Scanner;

public class CalculPretTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Citire date de la utilizator (sub formă de String)
        System.out.print("Introdu prețul produsului: ");
        String pretInput = scanner.nextLine();

        System.out.print("Introdu cantitatea cumpărată: ");
        String cantitateInput = scanner.nextLine();

        // 2. Conversie în int
        int pret = Integer.parseInt(pretInput);
        int cantitate = Integer.parseInt(cantitateInput);

        // 3. Calculul prețului total
        int total = pret * cantitate;

        // 4. Transformare în String și afișare mesaj
        String mesaj = "Prețul total al comenzii este: " + String.valueOf(total) + " lei";
        System.out.println(mesaj);
    }
}
