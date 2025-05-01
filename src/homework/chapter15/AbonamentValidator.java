import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AbonamentValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Format pentru data (ex: 2024-12-01)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Introdu data activării abonamentului (format yyyy-MM-dd): ");
        String dataText = scanner.nextLine();

        try {
            // 1. Data activării
            LocalDate dataActivare = LocalDate.parse(dataText, formatter);

            // 2. Data expirării = +3 luni
            LocalDate dataExpirare = dataActivare.plusMonths(3);
            LocalDate azi = LocalDate.now();

            System.out.println("📅 Data activării: " + dataActivare);
            System.out.println("📅 Data expirării: " + dataExpirare);

            // 3. Verificare activ sau expirat
            if (dataExpirare.isAfter(azi)) {
                System.out.println("✅ Abonamentul este încă activ.");
                Period ramase = Period.between(azi, dataExpirare);
                System.out.println("⏳ Mai sunt: " + ramase.getMonths() + " luni și " + ramase.getDays() + " zile.");
            } else {
                System.out.println("❌ Abonamentul a expirat.");
            }

        } catch (Exception e) {
            System.out.println("⚠️ Format invalid. Folosește formatul corect: yyyy-MM-dd");
        }

        scanner.close();
    }
}
