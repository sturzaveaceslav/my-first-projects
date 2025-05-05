import java.util.*;

public class ListaParticipanti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participanti = new ArrayList<>();

        while (true) {
            System.out.println("\nMeniu:");
            System.out.println("1. Adaugă participant");
            System.out.println("2. Verifică participant");
            System.out.println("3. Șterge participant");
            System.out.println("4. Afișează toți participanții (ordine alfabetică)");
            System.out.println("5. Afișează numărul total");
            System.out.println("0. Ieșire");
            System.out.print("Alege opțiunea: ");

            int optiune = Integer.parseInt(scanner.nextLine());

            switch (optiune) {
                case 1 -> {
                    System.out.print("Numele participantului: ");
                    String nume = scanner.nextLine();
                    participanti.add(nume);
                    System.out.println("Participant adăugat.");
                }
                case 2 -> {
                    System.out.print("Nume de verificat: ");
                    String nume = scanner.nextLine();
                    if (participanti.contains(nume)) {
                        System.out.println(nume + " este deja înregistrat.");
                    } else {
                        System.out.println(nume + " NU este înregistrat.");
                    }
                }
                case 3 -> {
                    System.out.print("Nume de șters: ");
                    String nume = scanner.nextLine();
                    if (participanti.remove(nume)) {
                        System.out.println("Participant șters.");
                    } else {
                        System.out.println("Participantul nu a fost găsit.");
                    }
                }
                case 4 -> {
                    List<String> listaSortata = new ArrayList<>(participanti);
                    Collections.sort(listaSortata);
                    System.out.println("Participanți în ordine alfabetică:");
                    for (String p : listaSortata) {
                        System.out.println("- " + p);
                    }
                }
                case 5 -> System.out.println("Număr total de participanți: " + participanti.size());
                case 0 -> {
                    System.out.println("Ieșire...");
                    return;
                }
                default -> System.out.println("Opțiune invalidă.");
            }
        }
    }
}
