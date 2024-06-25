public abstract class Pizza extends Food {
    private final int DOUGH_BASIC_COUNT = 1;

    @Override
    public boolean canMake() {
        Restaurant restaurant = Restaurant.getInstance();
        if (restaurant.hasIngredient(Ingredient.DOUGH, DOUGH_BASIC_COUNT)) {
            restaurant.useIngredient(Ingredient.DOUGH, DOUGH_BASIC_COUNT);
            return true;
        }
        return false;
    }
}
