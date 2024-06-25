public class IngredientDecorator extends FoodDecorator {
    private Ingredient ingredient;

    public IngredientDecorator(Food decoratedFood, Ingredient ingredient) {
        super(decoratedFood);
        this.ingredient = ingredient;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + ingredient.price();
    }

    @Override
    public boolean canMake() {
        Restaurant restaurant = Restaurant.getInstance();
        if (restaurant.hasIngredient(ingredient, 1) && super.canMake()) {
            restaurant.useIngredient(ingredient, 1);
            return true;
        }
        return false;
    }
}
