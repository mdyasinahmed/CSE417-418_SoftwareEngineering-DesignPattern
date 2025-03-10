package Lab_07.Strategy_GameAttack;

class Context {
    private attackStrategy attack_strategy;

    public Context(attackStrategy attack_strategy) {
        this.attack_strategy = attack_strategy;
    }

    public void doAttack() {
        attack_strategy.performAttack();
    }
    public void new_line(){
        System.out.println();
    }
}
