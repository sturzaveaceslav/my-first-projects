package cursuriPractice.com.restaurant.system;

public class Food extends Product {
    private int preparationTime;

    public Food(String name, double price, int preparationTime) {
        super(name, price); // super ne va apela constructourl instantei parinte
        this.preparationTime = preparationTime;

    }

    public int getPreparationTime() {
        return preparationTime;
    }

    @Override
    public String toString() {
        return super.toString() + " and preparation time is " + preparationTime + " Minutes";
    }
}
