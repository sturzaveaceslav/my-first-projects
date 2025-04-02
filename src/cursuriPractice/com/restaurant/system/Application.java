package cursuriPractice.com.restaurant.system;

public class Application {
    public static void main (String[] args) {
        Product product = new Product( "Pizza Mario", 101.25);
        System.out.println("Product ["+product.getName()+"] with price "+product.getPrice());
        product.setPrice(105.50);
        System.out.println("Product ["+product.getName()+"] with price "+product.getPrice());
    }
}
