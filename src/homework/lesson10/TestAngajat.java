package homework.lesson10;

import java.util.Arrays;

public class TestAngajat {
    public static void main(String[] args) {
        AngajatFullTime angajatFullTime = new AngajatFullTime("Andrei ", 12000, 30, 5);
        angajatPartTime angajatPartTime = new angajatPartTime("Alina ", 250, 50, 4, (Arrays.asList("IT", "Java")));
        System.out.println("Informatii AngajatFullTime : ");
        angajatFullTime.afiseazaInformatii();

        System.out.println("Salariu : " + angajatFullTime.calculeazaSalariu() + "LEI");
        System.out.println("\nINformatii angajat part-time ");
        angajatPartTime.afiseazaInformatii();
        System.out.println("Salariu : " + angajatPartTime.calculeazaSalariu() + "LEI");
    }
}
