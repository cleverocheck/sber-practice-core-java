package core.practice.sber.task2;

class BattleArena {
    public void fight(Character a, Character b) {
        while (a.isAlive() && b.isAlive()) {
            a.attack(b);
            if (b.isAlive()) b.attack(a);
        }
    }
}
