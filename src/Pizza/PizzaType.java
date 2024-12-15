package Pizza;

public enum PizzaType {
    REGULAR("regular", 1.0),
    CALZONE("calzone", 1.5);

    private final String name;
    private final double price;

    PizzaType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}