public abstract class FoodDecorator extends Food {
    protected Food decoratedFood;

    public FoodDecorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }

    @Override
    public double calculateCost() {
        return decoratedFood.calculateCost();
    }

    @Override
    public boolean canMake() {
        return decoratedFood.canMake();
    }
}
