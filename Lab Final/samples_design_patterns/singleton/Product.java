package samples_design_patterns.singleton;

public class Product {
    private static Product product_instance;
    private static int product_counts = 0;
    
        private Product(){
            System.out.println("Product Object Initialized");
        }
    
        public static Product getProduct(){
            if (product_counts == 0) {
                product_instance = new Product();
            }
            product_counts++;

            return product_instance;
        }

        public void printUpdate(){
            System.out.println("Product " + product_counts + " Created!");
            System.out.println("Total Proudcts: " + product_counts + "\n");
        }
}
