package decorator_design_pattern;

// Strategy Interface
interface PaymentStrategy {
    String pay(double amount);
}

// BkashPayment Concrete Strategy
class BkashPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using bKash for BDT " + amount;
    }
}

// NagadPayment Concrete Strategy
class NagadPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using Nagad for BDT " + amount;
    }
}

// CardPayment Concrete Strategy
class CardPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using Credit Card for BDT " + amount;
    }
}

// Checkout Context class
class Checkout {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        System.out.println(paymentStrategy.pay(amount));
    }
}

// Main Class
public class Main{
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.setPaymentStrategy(new BkashPayment());
        checkout.processPayment(500);

        checkout.setPaymentStrategy(new NagadPayment());
        checkout.processPayment(1000);

        checkout.setPaymentStrategy(new CardPayment());
        checkout.processPayment(1500);
    }
}
