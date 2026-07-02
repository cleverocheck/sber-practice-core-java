package core.practice.sber.task5;

class PizzaOrder {
    private String name;
    private PizzaSize size;
    private boolean withSauce;
    private String address;
    private boolean isAccepted;

    PizzaOrder(String name, PizzaSize size, boolean withSauce, String address) {
        this.name = name;
        this.size = size;
        this.withSauce = withSauce;
        this.address = address;
    }

    public void order() {
        if (isAccepted) System.out.println("Заказ уже принят");
        else {
            System.out.println("Заказ принят. " + size + " пицца \"" + name + "\" " + (withSauce ? "с соусом" : "без соуса") + " на адрес " + address);
            isAccepted = true;
        }
    }

    public void cancel() {
        if(isAccepted) {
            System.out.println("Заказ отменен");
            isAccepted = false;
        } else System.out.println("Заказ не был принят");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public boolean withSauce() {
        return withSauce;
    }

    public void setWithSauce(boolean withSauce) {
        this.withSauce = withSauce;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name + " " + size.name() + " " + withSauce + " " + address + " " + isAccepted;
    }
}