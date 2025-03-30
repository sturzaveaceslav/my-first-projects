package homework.lesson10;

public class AngajatFullTime  extends  Angajat{
    private double procentBonus;
    private int zileConcediu;

    public AngajatFullTime(String nume, double salariuDeBaza, double procentBonus, int zileConcediu) {
super (nume, salariuDeBaza);
this.procentBonus = procentBonus;
this.zileConcediu = zileConcediu;
    }
@Override
    public double calculeazaSalariu () {
        double bonus = salariuDeBaza * procentBonus / 100;
        return salariuDeBaza + bonus;
}
@Override
    public void afiseazaInformatii() {
        super.afiseazaInformatii();
        System.out.println("Procent: " + procentBonus + "%");
        System.out.println("Zile: " + zileConcediu);
}
}
