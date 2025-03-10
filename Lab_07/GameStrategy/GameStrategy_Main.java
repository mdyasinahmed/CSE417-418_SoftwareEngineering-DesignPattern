package Lab_07.GameStrategy;

interface AttackStrategy{
    public void performAttack();
}

class Melee_Attack implements AttackStrategy{
    public void performAttack(){
        System.out.println("Stabs with a knife for a melee strike!");
    }
}

class Ranged_Attack implements AttackStrategy{
    public void performAttack(){
        System.out.println("Fires with Riffle from a distance!");
    }
}
class Magic_Attack implements AttackStrategy{
    public void performAttack(){
        System.out.println("Casts a fireball with magic!");
    }
}

class Stealth_Attack implements AttackStrategy{
    public void performAttack(){
        System.out.println("Attacked with Stealth!");
    }
}

class Context {
    private AttackStrategy attack_strategy;

    public Context(AttackStrategy attack_strategy) {
        this.attack_strategy = attack_strategy;
    }

    public void doAttack() {
        attack_strategy.performAttack();
    }
    public void new_line(){
        System.out.println();
    }
}



public class GameStrategy_Main {
    public static void main(String args[]){
        Context context = new Context(new Melee_Attack());
        context.doAttack();
        context.new_line();

        context = new Context(new Ranged_Attack());
        context.doAttack();
        context.new_line();

        context = new Context(new Magic_Attack());
        context.doAttack();
        context.new_line();

        context = new Context(new Stealth_Attack());
        context.doAttack();
        context.new_line();
    }
}
