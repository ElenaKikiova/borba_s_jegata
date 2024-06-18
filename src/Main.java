import model.IceCream;

import java.util.List;

import static model.Flavour.*;
import static model.Topping.CHOCOLATE_GLAZE;
import static model.Topping.CHOCOLATE_SPRINKLES;

public class Main {

    public static void main(String[] args) {
        IceCreamShop iceCreamShop = IceCreamShop.getInstance();
        IceCream chocolateIceCream = iceCreamShop.sellIceCream(CHOCOLATE, List.of());
        IceCream strawberryIceCreamWithSprinklesAndGlaze = iceCreamShop.sellIceCream(STRAWBERRY, List.of(CHOCOLATE_SPRINKLES, CHOCOLATE_GLAZE));
        IceCream vanillaIceCreamWithGlaze = iceCreamShop.sellIceCream(VANILLA, List.of(CHOCOLATE_GLAZE));

        System.out.println("List of ice cream sold:");
        System.out.format("%10s%20s%40s", "Flavour", "Price", "Ingredients");
        System.out.println("\n-----------------------------------------------------------------------");
        List.of(chocolateIceCream, strawberryIceCreamWithSprinklesAndGlaze, vanillaIceCreamWithGlaze)
                .forEach((iceCream) -> {
                    System.out.format("%10s%20s%40s\n", iceCream.getFlavour(), iceCream.getPrice(), iceCream.getIngredients());
                });
    }
}