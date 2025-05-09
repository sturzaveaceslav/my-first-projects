package homework.chapter17.studentlist;

import java.util.*;
import java.util.stream.Collectors;

public class StudentProcessor {
    public static void main(String[] args) {
        List<Studentt> students = Arrays.asList(
                new Studentt("Andrei", Arrays.asList(9.0, 8.5, 10.0)),
                new Studentt("Maria", Arrays.asList(6.5, 5.0, 4.0)),
                new Studentt("Ion", Arrays.asList(7.0, 8.0, 9.0)),
                new Studentt("Ana", Arrays.asList(4.0, 5.0, 3.5)),
                new Studentt("Elena", Arrays.asList(10.0, 9.5, 9.0))
        );

        // 1. Filtrare: media > 8
        List<Studentt> peste8 = students.stream()
                .filter(s -> s.getAverage() > 8)
                .collect(Collectors.toList());

        System.out.println("1. Studenți cu media peste 8:");
        peste8.forEach(s -> System.out.println(s.getName() + " - media: " + String.format("%.2f", s.getAverage())));

        // 2. (deja afișat mai sus)

        // 3. Media generală a tuturor studenților
        double mediaGenerala = students.stream()
                .mapToDouble(Studentt::getAverage)
                .average()
                .orElse(0.0);

        System.out.printf("\n3. Media generală a tuturor studenților: %.2f\n", mediaGenerala);

        // 4. Grupare în Promovati (media >= 5) și Respinsi (< 5)
        Map<String, List<Studentt>> grupati = students.stream()
                .collect(Collectors.groupingBy(s -> s.getAverage() >= 5 ? "Promovati" : "Respinsi"));

        System.out.println("\n4. Grupare:");
        grupati.forEach((status, lista) -> {
            System.out.println(status + ":");
            lista.forEach(s -> System.out.println("  " + s));
        });

        // 5. Sortare descrescător după media notelor
        List<Studentt> sortatiDesc = students.stream()
                .sorted(Comparator.comparingDouble(Studentt::getAverage).reversed())
                .collect(Collectors.toList());

        System.out.println("\n5. Studenți sortați descrescător după medie:");
        sortatiDesc.forEach(System.out::println);
    }
}
