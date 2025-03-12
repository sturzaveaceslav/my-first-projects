package homework.lesson6;

import java.util.Scanner;

public class SeasonAfterFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul lunii: ");
        int luna = sc.nextInt();
        String sezon;

        switch (luna) {
            case 12:
            case 1:
            case 2:
                sezon = "Iarna";
                break;
            case 3:
            case 4:
            case 5:
                sezon = "Primavara";
                break;
            case 6:
            case 7:
            case 8:
                sezon = "Vara";
                break;
            case 9:
            case 10:
            case 11:
                sezon = "Toamna";
                break;
            default:
                sezon = "Luna introdusa incorect";

        }
        System.out.println(sezon);
    }
}
