package core.practice.sber.task5;

enum PizzaSize {
    SMALL("Маленькая"),
    MEDIUM("Средняя"),
    BIG("Большая");

    private final String label;

    PizzaSize(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
