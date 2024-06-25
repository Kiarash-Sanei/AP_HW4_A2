public class SmallPizza extends Pizza {
    private final int BASIC_COST = 2;

    @Override
    public double calculateCost() {
        return BASIC_COST;
    }
}
