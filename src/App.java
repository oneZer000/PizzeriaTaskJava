import Customer.Customer;
import Order.*;
import Pizza.*;

public class App {

    public static void main(String[] args) {

        Customer customer = new Customer("Ivan", "+77771234567");

        Order order = new Order(customer);

         Pizza pepperoni = Pizza.PEPPERONI;
         order.addPizza(pepperoni);

         Pizza customPizza = new Pizza("Custom", PizzaType.REGULAR, 2);
         customPizza.addIngredient(Ingredient.PEPPERONI);
         customPizza.addIngredient(Ingredient.TOMATO_PASTE);
         order.addPizza(customPizza);

         Printer.printCheck(order);

    }

}