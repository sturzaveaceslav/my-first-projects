package cursuriPractice.com.restaurant.system;

public class Product {
    private String name;
    private double price;


    // folosim constructorul

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
public double getTax() {
        return  0.0;
}
    @Override // suprascrierea
    public String toString() {
        return "Product [name=" + this.name + ", price=" + this.price;
    }
}
