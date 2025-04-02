package homework.lesson10.parteaII;

public class ContEconomii extends ContBancar {
    private static final double DOBANDA = 0.03;
    private boolean aRetrasLunaAceasta = false;

    public ContEconomii(String numarCont, String titular, double soldInitial) {
        super(numarCont, titular, soldInitial);
    }

    @Override
    public void retrage(double suma) {
        if (aRetrasLunaAceasta) {
            System.out.println("Tranzacție respinsA. Doar o retragere pe lună este permisA.");
        } else if (suma <= 0) {
            System.out.println("Suma trebuie să fie pozitiva.");
        } else if (suma > getSold()) {
            System.out.println("Fonduri insuficiente.");
        } else {
            scadeSold(suma);
            aRetrasLunaAceasta = true;
            System.out.println("Retragere reușita: " + suma + " LEI");
        }
    }

    public void aplicaDobandaAnuala() {
        double dobanda = getSold() * DOBANDA;
        adaugaSold(dobanda);
        System.out.println("Dobanda aplicatăa:  " + dobanda + " LEI");
    }

    public void resetRetragereLunara() {
        aRetrasLunaAceasta = false;
    }
}
