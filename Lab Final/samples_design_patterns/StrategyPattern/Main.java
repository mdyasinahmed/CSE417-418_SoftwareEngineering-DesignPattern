package samples_design_patterns.StrategyPattern;

interface Strategy {
    public int performanceOperation(int a, int b);
}

class Addition implements Strategy{
    public int performanceOperation(int a, int b) {
        return a+b;
    }
}

class Multipication implements Strategy{
    public int performanceOperation(int a, int b) {
        return a*b;
    }
}
class Substraction implements Strategy{
    public int performanceOperation(int a, int b) {
        return a-b;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doStrategy(int a, int b) {
        return strategy.performanceOperation(a, b);
    }
    
}

public class Main {
    public static void main(String[] args) {
        Context context =  new Context(new Addition());
        System.out.println("Addition: " + context.doStrategy(100, 200));
        
        context =  new Context(new Substraction());
        System.out.println("Substraction: " + context.doStrategy(300, 200));
    }
}
