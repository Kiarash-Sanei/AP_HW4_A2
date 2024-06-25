import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class OrderHandler {
    public void processOrder(Food food) {
        if (food.canMake()) {
            Restaurant.getInstance().addIncome(food.calculateCost());
            System.out.println("Order Completed!");
        } else {
            System.out.println("Order Dismissed!");
        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        OrderHandler orderProcessor = new OrderHandler();
        Scanner scanner = new Scanner(System.in);
        int requestCount = scanner.nextInt();
        for (int i = 0; i < 23; i++)
            restaurant.addIngredient(Ingredient.getIngredient(i), scanner.nextInt());
        scanner.nextLine();
        for (int i = 0; i < requestCount; i++) {
            ArrayList<String> line = RequestTranslator.translate(scanner.nextLine());
            System.out.println(line);
            if (Objects.equals(line.get(0), "Sandwich")) {
                Food sandwich = new Sandwich();
                for (int j = 1; j < line.size(); j++)
                    sandwich = new IngredientDecorator(sandwich, Ingredient.getIngredient(line.get(j)));
                orderProcessor.processOrder(sandwich);
            } else if (Objects.equals(line.get(0), "Small Pizza")) {
                Food pizza = new SmallPizza();
                for (int j = 1; j < line.size(); j++)
                    pizza = new IngredientDecorator(pizza, Ingredient.getIngredient(line.get(j)));
                orderProcessor.processOrder(pizza);
            } else if (Objects.equals(line.get(0), "Medium Pizza")) {
                Food pizza = new MediumPizza();
                for (int j = 1; j < line.size(); j++)
                    pizza = new IngredientDecorator(pizza, Ingredient.getIngredient(line.get(j)));
                orderProcessor.processOrder(pizza);
            } else if (Objects.equals(line.get(0), "Large Pizza")) {
                Food pizza = new LargePizza();
                for (int j = 1; j < line.size(); j++)
                    pizza = new IngredientDecorator(pizza, Ingredient.getIngredient(line.get(j)));
                orderProcessor.processOrder(pizza);
            }
        }
        System.out.printf("The final profit is: %.1f\n", Restaurant.getInstance().getIncome());
    }
}
