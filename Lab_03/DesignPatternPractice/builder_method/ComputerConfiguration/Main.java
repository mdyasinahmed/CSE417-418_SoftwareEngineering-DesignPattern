package Lab_03.DesignPatternPractice.builder_method.ComputerConfiguration;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();

        order1.setProcessor("i3")
                .setStorage("8/256")
                .setGraphics_card("NVDIA");

        System.out.println("Order 1 Info:\n" + order1.toString());

        Order order2 = new Order();
            order2.setProcessor("AMD Ryzen")
                .setStorage("16/512")
                .setGraphics_card("AMD");

        System.out.println("Order 2 Info:\n" + order2.toString());
        
    }
}
