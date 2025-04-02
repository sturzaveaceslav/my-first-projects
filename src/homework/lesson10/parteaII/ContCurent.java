package homework.lesson10.parteaII;

public class ContCurent extends ContBancar {
    private static final double SOLD_MINIM = 50.0;

    public ContCurent(String numarCont, String titular, double soldInitial) {
        super(numarCont, titular, soldInitial);
    }

    @Override
    public void retrage(double suma) {
        if (suma <= 0) {
            System.out.println("Suma trebuie ss fie pozitivs.");
        } else if (getSold() - suma < SOLD_MINIM) {
            System.out.println("Tranzacție respinss. Soldul nu poate scsdea sub " + SOLD_MINIM + " LEI");
        } else {
            scadeSold(suma);
            System.out.println("Retragere reudits: " + suma + " LEI");
        }
    }
}
