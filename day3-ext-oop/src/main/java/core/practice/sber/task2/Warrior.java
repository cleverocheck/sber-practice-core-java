package core.practice.sber.task2;

class Warrior extends Character {
    public Warrior(String name, double health, double attackDamage) {
        super(name, health, attackDamage);
    }

    @Override
    public void attack(Character target) {
        double damage = getAttackDamage();
        if (getHealth() < 50) damage *= 1.2;
        target.setHealth(target.getHealth() - damage);
    }
}
