import model.IceCream;

import java.util.List;

import static model.Flavour.*;
import static model.Topping.*;

public class Main {

    public static void main(String[] args) {
        IceCreamShop iceCreamShop = IceCreamShop.getInstance();
        IceCream chocolateIceCream = iceCreamShop.prepareIceCream(CHOCOLATE, List.of());
        IceCream vanillaIceCream = iceCreamShop.prepareIceCream(VANILLA, List.of());
        IceCream strawberryIceCream = iceCreamShop.prepareIceCream(STRAWBERRY, List.of());
        IceCream chocolateIceCreamWithGlaze = iceCreamShop.prepareIceCream(CHOCOLATE, List.of(CHOCOLATE_GLAZE));
        IceCream strawberryIceCreamWithSprinklesAndGlaze = iceCreamShop.prepareIceCream(STRAWBERRY, List.of(CHOCOLATE_SPRINKLES, CHOCOLATE_GLAZE));
        IceCream vanillaIceCreamWithGlaze = iceCreamShop.prepareIceCream(VANILLA, List.of(CHOCOLATE_GLAZE));
        IceCream strawberryIceCreamWithGlaze = iceCreamShop.prepareIceCream(STRAWBERRY, List.of(VANILLA_GLAZE));
        IceCream chocolateIceCreamWithSprinkles = iceCreamShop.prepareIceCream(CHOCOLATE, List.of(VANILLA_SPRINKLES));

        List<IceCream> SoldIceCreamList = List.of(
                chocolateIceCream,
                chocolateIceCreamWithGlaze,
                strawberryIceCreamWithSprinklesAndGlaze,
                vanillaIceCreamWithGlaze,
                strawberryIceCreamWithGlaze,
                chocolateIceCreamWithSprinkles
        );

        List<IceCream> AllIceCream = List.of(
                chocolateIceCream,
                vanillaIceCream,
                strawberryIceCream
        );


        System.out.println("MENU");
        System.out.format("%-70s%-20s%-40s", "Item", "Price", "Ingredients");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        AllIceCream
                .forEach((iceCream) -> {
                    System.out.format("%-70s%-20s%-40s\n", iceCream.getFlavour(), iceCream.getPrice(), iceCream.getIngredientsString());
                });

        System.out.println("\nList of ice cream sold:");
        System.out.format("%-70s%-20s%-40s", "Ice cream", "Price", "Ingredients");
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        SoldIceCreamList
                .forEach((iceCream) -> {
                    System.out.format("%-70s%-20s%-40s\n", iceCream.getFlavour(), iceCream.getPrice(), iceCream.getIngredientsString());
                });
    }
}