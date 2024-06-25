public class LargePizza extends Pizza {
    private final int BASIC_COST = 5;

    @Override
    public double calculateCost() {
        return BASIC_COST;
    }
}
