package Lab_06.Task;

interface PaymentStrategy{
    public int pay(int money); 
}

class CreditCardPayment implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}
class BkashPayment implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}
class CashOnDelivery implements PaymentStrategy {
    public int pay(int money) {
        return money;
    }
}

class Context {
    private PaymentStrategy payment_strategy;

    public Context(PaymentStrategy payment_strategy) {
        this.payment_strategy = payment_strategy;
    }

    public int doPayment(int money) {
        return payment_strategy.pay(money);
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new BkashPayment());
        System.out.println("Paid with Bkash. Amount: " + context.doPayment(500));

        context = new Context(new CashOnDelivery());
        System.out.println("Paid with Cash on Delivery. Amount: " + context.doPayment(1500));

        context = new Context(new CreditCardPayment());
        System.out.println("Paid with Credit Card. Amount: " + context.doPayment(50000));
    }
}
