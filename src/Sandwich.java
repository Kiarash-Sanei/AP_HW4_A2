public class Sandwich extends Food {
    private final int BREAD_BASIC_COUNT = 2;
    private final int BASIC_COST = 2;

    @Override
    public boolean canMake() {
        Restaurant restaurant = Restaurant.getInstance();
        if (restaurant.hasIngredient(Ingredient.BREAD, BREAD_BASIC_COUNT)) {
            restaurant.useIngredient(Ingredient.BREAD, BREAD_BASIC_COUNT);
            return true;
        }
        return false;
    }

    @Override
    public double calculateCost() {
        return BASIC_COST;
    }
}
