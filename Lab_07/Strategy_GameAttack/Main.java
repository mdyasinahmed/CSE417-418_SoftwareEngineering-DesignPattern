package Lab_07.Strategy_GameAttack;

public class Main {
    public static void main(String args[]){
        Context context = new Context(new meleeAttack());
        context.doAttack();
        context.new_line();

        context = new Context(new rangedAttack());
        context.doAttack();
        context.new_line();

        context = new Context(new magicAttack());
        context.doAttack();
        context.new_line();

        context = new Context(new stealthAttack());
        context.doAttack();
        context.new_line();
    }
}