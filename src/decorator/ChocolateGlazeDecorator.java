package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class ChocolateGlazeDecorator extends IceCreamToppingDecorator {

    public ChocolateGlazeDecorator(IceCream iceCream) {
        super(Flavour.CHOCOLATE.getFlavour(),
                0.5,
                List.of("Sugar", "Cocoa powder", "Milk"),
                iceCream);
    }
}
