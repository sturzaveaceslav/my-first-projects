package persoana1;

import java.util.Scanner;

public class TernaryConstruct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indroduce-ti varsta:");
        int varsta = scanner.nextInt();
        System.out.println("Indroduce-ti starea civila (casatorit sau necasatorit):");
        String stareCivila = scanner.next();
        String eligibil = (varsta < 18) ? (stareCivila.equals("casatorit") ? "Eligibil pentru reduceri " :
        "Nu este eligibil pentru reducere") :
        (stareCivila.equals("casatorit") ? "Eligibil petnru reduceri" : "Nu este eligibil pentru reducere");
        System.out.println(eligibil);


    }
}
