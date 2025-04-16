package final_tasks.decorator;

interface PaymentStrategy {
    String pay(double amount);
}

class BkashPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using bKash for BDT " + amount;
    }
}

class NagadPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using Nagad for BDT " + amount;
    }
}

class CardPayment implements PaymentStrategy {
    public String pay(double amount) {
        return "Payment is done using Credit Card for BDT " + amount;
    }
}

class Checkout {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        System.out.println(paymentStrategy.pay(amount));
    }
}

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        checkout.setPaymentStrategy(new BkashPayment());
        checkout.processPayment(500);

        checkout.setPaymentStrategy(new NagadPayment());
        checkout.processPayment(500);

        checkout.setPaymentStrategy(new CardPayment());
        checkout.processPayment(500);
    }
}

