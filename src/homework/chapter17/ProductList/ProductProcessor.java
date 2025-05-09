package homework.chapter17.ProductList;

import java.util.*;
import java.util.stream.Collectors;

public class ProductProcessor {
    public static void main(String[] args) {
        List<Productt> products = Arrays.asList(
                new Productt("Laptop", "Electronics", 3500),
                new Productt("Mouse", "Electronics", 80),
                new Productt("Carte", "Books", 50),
                new Productt("Monitor", "Electronics", 900),
                new Productt("Pix", "Stationery", 5),
                new Productt("Caiet", "Stationery", 15),
                new Productt("Enciclopedie", "Books", 120)
        );

        // 1. Filtrare: produse > 100 lei
        List<Productt> peste100 = products.stream()
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println("1. Produse peste 100 lei:");
        peste100.forEach(System.out::println);

        // 2. Sortare crescătoare după preț
        List<Productt> sortate = products.stream()
                .sorted(Comparator.comparingDouble(Productt::getPrice))
                .collect(Collectors.toList());

        System.out.println("\n2. Produse sortate după preț:");
        sortate.forEach(System.out::println);

        // 3. Afișare deja făcută mai sus

        // 4. Grupare după categorie
        Map<String, List<Productt>> grupate = products.stream()
                .collect(Collectors.groupingBy(Productt::getCategory));

        System.out.println("\n4. Produse grupate pe categorii:");
        grupate.forEach((categorie, lista) -> {
            System.out.println("Categoria: " + categorie);
            lista.forEach(p -> System.out.println("  " + p));
        });

        // 5. Suma totală
        double sumaTotala = products.stream()
                .mapToDouble(Productt::getPrice)
                .sum();
        System.out.println("\n5. Suma totală a produselor: " + sumaTotala + " lei");

        // 6. Listă cu doar numele produselor
        List<String> numeProduse = products.stream()
                .map(Productt::getName)
                .collect(Collectors.toList());

        System.out.println("\n6. Nume produse: " + numeProduse);
    }
}
