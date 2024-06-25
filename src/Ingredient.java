public enum Ingredient {
    BACON(2.2),
    BASIL(1.2),
    BREAD(0.8),
    CHEESE(1.0),
    CHICKEN(2.4),
    CORN(1.0),
    DOUGH(0),
    EGG(1.9),
    FRIES(3.6),
    GARLIC(3.6),
    HAMBURGER(2.8),
    JALAPENO(4.0),
    LETTUCE(1.8),
    MUSHROOM(1.6),
    OLIVE(1.6),
    ONION(3.5),
    PEPPER(1.8),
    PEPPERONI(3.0),
    PICKLES(2.8),
    SALAMI(1.5),
    SAUCE(1.0),
    TOMATO(3.2),
    TUNA(2.8);
    private final double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }

    public static Ingredient getIngredient(int ordinal) {
        return Ingredient.values()[ordinal];
    }

    public static Ingredient getIngredient(String name) {
        switch (name) {
            case "Bacon":
                return BACON;
            case "Basil":
                return BASIL;
            case "Bread":
                return BREAD;
            case "Cheese":
                return CHEESE;
            case "Chicken":
                return CHICKEN;
            case "Corn":
                return CORN;
            case "Dough":
                return DOUGH;
            case "Egg":
                return EGG;
            case "Fries":
                return FRIES;
            case "Garlic":
                return GARLIC;
            case "Hamburger":
                return HAMBURGER;
            case "Jalapeno":
                return JALAPENO;
            case "Lettuce":
                return LETTUCE;
            case "Mushroom":
                return MUSHROOM;
            case "Olive":
                return OLIVE;
            case "Onion":
                return ONION;
            case "Pepper":
                return PEPPER;
            case "Pepperoni":
                return PEPPERONI;
            case "Pickles":
                return PICKLES;
            case "Salami":
                return SALAMI;
            case "Sauce":
                return SAUCE;
            case "Tuna":
                return TUNA;
            case "Tomato":
                return TOMATO;
            default:
                return null;
        }
    }
}
