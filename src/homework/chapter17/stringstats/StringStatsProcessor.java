package homework.chapter17.stringstats;

import java.util.*;
import java.util.stream.Collectors;

public class StringStatsProcessor {
    public static void main(String[] args) {
        List<String> cuvinte = Arrays.asList(
                "informatica", "java", "string", "procesare", "date", "console", "afisare", "stream", "lambda", "clasa"
        );

        // 1. Filtrare: doar cuvintele cu lungime > 5
        List<String> lungi = cuvinte.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        // 2. Transformare în majuscule
        List<String> upper = lungi.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // 3. Sortare alfabetică
        List<String> sortate = upper.stream()
                .sorted()
                .collect(Collectors.toList());

        // 4. Grupare după prima literă
        Map<Character, List<String>> grupate = sortate.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        // 5. Afișare
        System.out.println("Cuvinte procesate (lungi, majuscule, sortate și grupate):");
        grupate.forEach((litera, lista) -> {
            System.out.println("Litera " + litera + ": " + lista);
        });

        // 6. Lungimea totală a tuturor cuvintelor originale
        int lungimeTotala = cuvinte.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("\nLungimea totală a tuturor cuvintelor: " + lungimeTotala + " caractere");
    }
}
