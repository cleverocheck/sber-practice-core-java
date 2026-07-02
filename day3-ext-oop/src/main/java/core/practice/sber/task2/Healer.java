package core.practice.sber.task2;

class Healer extends Character {
    public Healer(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - getAttackDamage() * 0.5);
        setHealth(getHealth() + 10);
    }
}
