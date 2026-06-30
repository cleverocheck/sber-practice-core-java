public class Task5 {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Аль-Капчоне", PizzaSize.BIG, true, "Ярославская 101");

        System.out.println(pizzaOrder.getName());
        System.out.println(pizzaOrder.getSize());
        System.out.println(pizzaOrder.withSauce());
        System.out.println(pizzaOrder.getAddress());
        
        pizzaOrder.cancel();
        pizzaOrder.order();
        pizzaOrder.order();
        pizzaOrder.cancel();

        pizzaOrder.setName("Гавайская");
        pizzaOrder.setSize(PizzaSize.SMALL);
        pizzaOrder.setWithSauce(false);
        pizzaOrder.setAddress("Козленская 33");
        pizzaOrder.order();

        System.out.print(pizzaOrder);
    }
}

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
            System.out.println("Заказ принят. " + size + " пицца «" + name + "» " + (withSauce ? "с соусом" : "без соуса") + " на адрес " + address);
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