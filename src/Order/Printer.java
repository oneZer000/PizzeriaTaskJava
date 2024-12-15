package Order;

import Pizza.*;

public class Printer {
    public static void printCheck(Order order) {
        System.out.println("*****************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("*****************************");

        for (Pizza pizza : order.getPizzas()) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("------------------------");
            System.out.println("Pizza Base: " + pizza.getPizzaType() + " " + pizza.getPizzaType().getPrice() + " $");

            for (Ingredient ingredient : pizza.getIngredients()) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }

            System.out.println("------------------------");
            System.out.println("Quantity: " + pizza.getQuantity());
            System.out.printf("Amount: %.10f $\n", pizza.calculatePrice());
            System.out.println("------------------------");
        }

        System.out.println("******************************");
    }
}