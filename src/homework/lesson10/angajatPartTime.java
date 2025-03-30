package homework.lesson10;

import java.util.List;
public class angajatPartTime extends Angajat {
    private double plataPeOra;
    private int oreLucrate;
    private List<String> departamente;


    public angajatPartTime(String nume, double salariuDeBaza, double plataPeOra, int oreLucrate, List<String> departamente ) {
      super(nume, salariuDeBaza);
      this.plataPeOra = plataPeOra;
      this.oreLucrate = oreLucrate;
      this.departamente = departamente;

    }
    @Override
    public double calculeazaSalariu() {
        return plataPeOra * oreLucrate;
    }
    @Override
    public void afiseazaInformatii() {
        super.afiseazaInformatii();
        System.out.printf("Plata pe ora:" + plataPeOra + "Lei");
        System.out.printf("Ore lucrate:" + oreLucrate);
        System.out.printf("Departamente:" + departamente);
    }
}
