package Pizza;

public enum Ingredient {
    TOMATO_PASTE("tomato paste", 1.0),
    CHEESE("Cheese", 1.0),
    SALAMI("Salami", 1.5),
    BACON("Bacon", 1.2),
    CORN("Corn", 0.7),
    PEPPERONI("Pepperoni", 0.6);

    private final String name;
    private final double price;

    Ingredient(String name, double price) {
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
