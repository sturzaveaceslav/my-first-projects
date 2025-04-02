package homework.lesson10.parteaII;

public abstract class ContBancar {
    private String numarCont;
    private String titular;
    private double sold;

    public ContBancar(String numarCont, String titular, double soldInitial) {
        this.numarCont = numarCont;
        this.titular = titular;
        this.sold = soldInitial;
    }

    public void depune(double suma) {
        if (suma > 0) {
            adaugaSold(suma);
            System.out.println("Depunere reușita: " + suma + " LEI");
        } else {
            System.out.println("Suma de depunere trebuie să fie pozitiva.");
        }
    }

    public abstract void retrage(double suma);

    public void afiseazaDetalii() {
        System.out.println("Cont: " + numarCont);
        System.out.println("Titular: " + titular);
        System.out.println("Sold: " + sold + " LEI");
    }

    public double getSold() {
        return sold;
    }

    protected void scadeSold(double suma) {
        this.sold -= suma;
    }

    protected void adaugaSold(double suma) {
        this.sold += suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public String getTitular() {
        return titular;
    }
}
