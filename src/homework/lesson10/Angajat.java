package homework.lesson10;

public abstract class Angajat {
    protected String nume;
    protected double salariuDeBaza;

    public Angajat(String nume, double salariuDeBaza) {
        this.nume = nume;
        this.salariuDeBaza = salariuDeBaza;
    }

    public abstract double calculeazaSalariu();

    public void afiseazaInformatii() {
        System.out.println("Nume " + nume);
        System.out.println("Salariu " + salariuDeBaza);
    }
    public double getSalariuDeBaza() {
        return salariuDeBaza;
    }

}
