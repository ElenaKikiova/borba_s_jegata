import decorator.*;
import factory.AbstractIceCreamFactory;
import model.Flavour;
import model.IceCream;
import model.Topping;

import java.util.List;
import java.util.Objects;

public final class IceCreamShop {

    private static IceCreamShop iceCreamShop;

    public static IceCreamShop getInstance() {
        if (Objects.isNull(iceCreamShop)) {
            iceCreamShop = new IceCreamShop();
        }
        return iceCreamShop;
    }

    private final AbstractIceCreamFactory abstractIceCreamFactory = AbstractIceCreamFactory.getInstance();

    private IceCreamShop() {

    }

    public IceCream prepareIceCream(Flavour flavour, List<Topping> toppings) {
        IceCream iceCream = abstractIceCreamFactory.prepareIceCream(flavour);
        return addToppings(toppings, iceCream);
    }

    private IceCream addToppings(List<Topping> toppings, IceCream iceCream) {
        if (toppings.isEmpty()) {
            return iceCream;
        } else {
            return constructToppingDecorator(toppings, iceCream);
        }
    }

    private IceCream constructToppingDecorator(List<Topping> toppings, IceCream iceCream) {
        IceCreamToppingDecorator iceCreamToppingDecorator = null;
        for (int i = 0; i < toppings.size(); i++) {
            if (i == 0) {
                iceCreamToppingDecorator = constructToppingDecorator(toppings.get(i), iceCream);
            } else {
                iceCreamToppingDecorator = constructToppingDecorator(toppings.get(i), iceCreamToppingDecorator);
            }
        }
        return iceCreamToppingDecorator;
    }

    private IceCreamToppingDecorator constructToppingDecorator(Topping topping, IceCream iceCream) {
        return switch (topping) {
            case CHOCOLATE_GLAZE -> new ChocolateGlazeDecorator(iceCream);
            case CHOCOLATE_SPRINKLES -> new ChocolateSprinklesDecorator(iceCream);
            case VANILLA_GLAZE -> new VanillaGlazeDecorator(iceCream);
            case VANILLA_SPRINKLES -> new VanillaSprinklesDecorator(iceCream);
        };
    }
}
