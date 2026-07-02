package core.practice.sber.task2;

class Mage extends Character {
    public Mage(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        double factor = 0.7 + Math.random() * 0.6;
        target.setHealth(target.getHealth() - getAttackDamage() * factor);
    }
}