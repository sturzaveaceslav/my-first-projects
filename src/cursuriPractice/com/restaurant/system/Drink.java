package cursuriPractice.com.restaurant.system;

public class Drink extends Product {
    private boolean alcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        super(name, price);
        this.alcoholic = isAlcoholic;

    }
    public boolean isAlcoholic() {
        return alcoholic;

    }
    @Override
    public String toString() {
        return super.toString() + "is alchoogloc" + alcoholic;
    }
}
