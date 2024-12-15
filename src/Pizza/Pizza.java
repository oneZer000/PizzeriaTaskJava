package Pizza;

import java.util.Arrays;

public class Pizza {
    public static final int MAX_ALLOWED_INGREDIENTS = 7;

    public static final Pizza ITALIANO = new Pizza("Italiano", PizzaType.REGULAR,
            new Ingredient[]{Ingredient.TOMATO_PASTE, Ingredient.SALAMI}, 2);
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE,
            new Ingredient[]{Ingredient.CHEESE, Ingredient.BACON}, 1);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR,
            new Ingredient[]{Ingredient.PEPPERONI, Ingredient.CHEESE}, 1);

    private final String name;
    private final PizzaType pizzaType;
    private final Ingredient[] ingredients;
    private final int quantity;
    private int ingredientsCount;

    // Конструктор для пустой пиццы
    public Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
        this.quantity = quantity;
        this.ingredientsCount = 0;
    }

    // Конструктор для пиццы с готовым набором ингредиентов
    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = Arrays.copyOf(ingredients, ingredients.length);
        this.quantity = quantity;
        this.ingredientsCount = ingredients.length;
    }

    // Добавление ингредиента с проверкой на дубликаты
    public boolean addIngredient(Ingredient ingredient) {
        if (ingredientsCount == MAX_ALLOWED_INGREDIENTS) {
            return false;
        }

        for (Ingredient existingIngredient : ingredients) {
            if (existingIngredient == ingredient) {
                return false; // Ингредиент уже есть
            }
        }

        ingredients[ingredientsCount++] = ingredient;
        return true;
    }

    // Расчет стоимости пиццы
    public double calculatePrice() {
        double totalPrice = pizzaType.getPrice();
        for (int i = 0; i < ingredientsCount; i++) {
            totalPrice += ingredients[i].getPrice();
        }
        return totalPrice * quantity;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return Arrays.copyOf(ingredients, ingredientsCount);
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }
}
