package samples_design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Product p1 = Product.getProduct();
        p1.printUpdate();
        
        Product p2 = Product.getProduct();
        p2.printUpdate();
    }
}
