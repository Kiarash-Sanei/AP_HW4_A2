public class MediumPizza extends Pizza {
    private final int BASIC_COST = 4;

    @Override
    public double calculateCost() {
        return BASIC_COST;
    }
}
