import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OrarCurs {
    public static void main(String[] args) {
        // Data primei lecții
        LocalDate primaLectie = LocalDate.of(2025, 4, 24);
        LocalTime oraCurs = LocalTime.of(17, 0); // ora 17:00

        // Formatter pentru afișare: zi săptămână, zi lună an, oră:minut
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, HH:mm");

        System.out.println("🗓️ Următoarele 5 lecții săptămânale:");

        // Afișare 5 lecții săptămânale
        for (int i = 0; i < 5; i++) {
            LocalDateTime lectie = LocalDateTime.of(primaLectie.plusWeeks(i), oraCurs);
            System.out.println("📚 Lecția " + (i + 1) + ": " + lectie.format(formatter));
        }
    }
}
