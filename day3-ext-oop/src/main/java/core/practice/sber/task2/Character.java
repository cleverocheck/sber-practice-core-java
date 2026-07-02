package core.practice.sber.task2;

abstract class Character {
    private final String name;
    private double health;
    private final double attackDamage;

    public Character(String name, double health, double attackDamage) {
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public abstract void attack(Character target);
}