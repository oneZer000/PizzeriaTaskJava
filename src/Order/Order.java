package Order;

import java.util.Arrays;
import Customer.Customer;
import Pizza.*;

public class Order {
    private static int nextOrderNumber = 1;
    private final int orderNumber;
    private Customer customer;
    private Pizza[] pizzas;
    private int pizzaCount;

    public Order(Customer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.pizzas = new Pizza[10]; // Инициализируем массив с начальным размером
        this.pizzaCount = 0;
    }

    public void addPizza(Pizza pizza) {
        if (pizzaCount == pizzas.length) {
            // Если массив полон, увеличиваем его размер
            pizzas = Arrays.copyOf(pizzas, pizzas.length * 2);
        }
        pizzas[pizzaCount++] = pizza;
    }

    // Геттеры и сеттеры
    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pizza[] getPizzas() {
        return Arrays.copyOf(pizzas, pizzaCount);
    }

}