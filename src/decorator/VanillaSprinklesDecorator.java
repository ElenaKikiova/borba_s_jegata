package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class VanillaSprinklesDecorator extends IceCreamToppingDecorator {

    public VanillaSprinklesDecorator(IceCream iceCream) {
        super(Flavour.VANILLA.getFlavour(),
                0.5,
                List.of("Sugar", "Vanilla syrup", "Starch"),
                iceCream);
    }

    @Override
    protected String getToppingName() {
        return "Vanilla Sprinkles";
    }
}
