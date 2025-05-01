import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class ProgramareMedicala {
    public static void main(String[] args) {
        // Data programării
        LocalDateTime programare = LocalDateTime.of(2025, 5, 10, 14, 30);
        LocalDateTime acum = LocalDateTime.now();

        // Verificare dacă e în trecut sau viitor
        if (programare.isBefore(acum)) {
            System.out.println(" Programarea este în trecut.");
        } else {
            System.out.println(" Programarea este în viitor.");

            // Calcul zile întregi rămase (folosim doar data, fără oră)
            Period perioada = Period.between(LocalDate.now(), programare.toLocalDate());
            int zileRamase = perioada.getDays() + perioada.getMonths() * 30 + perioada.getYears() * 365;

            System.out.println( "Mai sunt aproximativ " + zileRamase + " zile întregi până la programare.");

            // Afișare dată formatată
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm");
            System.out.println(" Programarea este pe: " + programare.format(formatter));
        }
    }
}
