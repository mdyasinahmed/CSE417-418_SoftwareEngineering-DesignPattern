// Strategy Pattern
//      1. Base Class -> Done
//      2. Multiple Usecase Class -> Done
//      3. Context class -> Done
//      -> Implementation in Main class

//      1. Base Class -> Done
interface PaymentStrategy {
    public int pay(int money);
}

//      2. Multiple Usecase Class -> Done
class CreditCardPayment implements PaymentStrategy{
    public int pay(int money){
        return money;
    }
}
class BkashPayment implements PaymentStrategy{
    public int pay(int money){
        return money;
    }
}
class CashOnDelivery implements PaymentStrategy{
    public int pay(int money){
        return money;
    }
}

//      3. Context class -> Done
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
        Context context = new Context(new CashOnDelivery());
        System.out.println("Cash On Delivery Paid. Amount: " + context.doPayment(999));

        context = new Context(new BkashPayment());
        System.out.println("Bkash Paid. Amount: " + context.doPayment(2000));

        context = new Context(new CreditCardPayment());
        System.out.println("Credit Card Payment. Amount: " + context.doPayment(30000));
    }
}


