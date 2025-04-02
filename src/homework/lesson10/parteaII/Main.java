package homework.lesson10.parteaII;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContBancar cont = null;
        System.out.println("===== Sistem de Gestionare a Conturilor Bancare =====");
        System.out.println("Ce tip de cont dorești să creezi?");
        System.out.println("1. Cont Curent");
        System.out.println("2. Cont Economii");
        int optiune = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduceți numărul contului: ");
        String nrCont = sc.nextLine();
        System.out.print("Introduceți numele titularului: ");
        String nume = sc.nextLine();
        System.out.print("Introduceți soldul inițial: ");
        double soldInitial = sc.nextDouble();

        if (optiune == 1) {
            cont = new ContCurent(nrCont, nume, soldInitial);
        } else if (optiune == 2) {
            cont = new ContEconomii(nrCont, nume, soldInitial);
        } else {
            System.out.println("Opțiune invalida.");
            return;
        }

        int alegere = -1;
        while (alegere != 0) {
            System.out.println("\n--- Meniu ---");
            System.out.println("1. Depunere");
            System.out.println("2. Retragere");
            System.out.println("3. Afișare detalii");
            if (cont instanceof ContEconomii) {
                System.out.println("4. Aplicare dobanda anuala");
                System.out.println("5. Resetare retragere lunara");
            }
            System.out.println("0. Ieșire");
            System.out.print("Alege o opțiune: ");
            alegere = sc.nextInt();

            switch (alegere) {
                case 1:
                    System.out.print("Suma de depus: ");
                    cont.depune(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Suma de retras: ");
                    cont.retrage(sc.nextDouble());
                    break;
                case 3:
                    cont.afiseazaDetalii();
                    break;
                case 4:
                    if (cont instanceof ContEconomii) {
                        ((ContEconomii) cont).aplicaDobandaAnuala();
                    } else {
                        System.out.println("Opțiune invalidă.");
                    }
                    break;
                case 5:
                    if (cont instanceof ContEconomii) {
                        ((ContEconomii) cont).resetRetragereLunara();
                        System.out.println("Retragere lunară resetata.");
                    } else {
                        System.out.println("Opțiune invalida.");
                    }
                    break;
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Opțiune necunoscutaa.");
            }
        }


    }
}