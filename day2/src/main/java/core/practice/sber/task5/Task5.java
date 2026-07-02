package core.practice.sber.task5;

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