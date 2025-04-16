package md.enums;

import static md.enums.DayOfWeek.DUMINICA;
import static md.enums.DayOfWeek.SAMBATA;

public class DayOfWeekTest {
    public static void main(String[] args) {
        md.enums.DayOfWeek today = md.enums.DayOfWeek.LUNI;

        switch (today) {
            case SAMBATA, DUMINICA -> System.out.println("Este weekend: relaxare!");
            default -> System.out.println("Este zi lucrătoare.");
        }

        if (!today.isWeekend()) {
            System.out.println("Program: 9:00 - 17:00");
        } else {
            System.out.println("Program: Închis");
        }
    }
}
