import java.util.HashMap;

public class Restaurant {
    private static Restaurant restaurant;
    public HashMap<Ingredient, Integer> stock;
    private double income;

    private Restaurant() {
        stock = new HashMap<>();
        income = 0;
    }

    public static Restaurant getInstance() {
        if (restaurant == null)
            restaurant = new Restaurant();
        return restaurant;
    }

    public boolean hasIngredient(Ingredient ingredient, int quantity) {
        if (stock.containsKey(ingredient))
            return stock.get(ingredient) >= quantity;
        else
            return false;
    }

    public void addIngredient(Ingredient ingredient, int quantity) {
        if (!stock.containsKey(ingredient))
            stock.put(ingredient, quantity);
        else
            stock.put(ingredient, stock.get(ingredient) + quantity);
    }

    public void useIngredient(Ingredient ingredient, int quantity) {
        stock.put(ingredient, stock.get(ingredient) - quantity);
    }

    public double getIncome() {
        return income;
    }

    public void addIncome(double amount) {
        income += amount;
    }

}
