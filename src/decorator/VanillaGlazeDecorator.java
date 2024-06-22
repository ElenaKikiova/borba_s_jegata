package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class VanillaGlazeDecorator extends IceCreamToppingDecorator {

    public VanillaGlazeDecorator(IceCream iceCream) {
        super(Flavour.VANILLA.getFlavour() ,
                0.5,
                List.of("Sugar", "Vanilla syrup", "Milk", "Glucose syrup"),
                iceCream);
    }

    @Override
    protected String getToppingName() {
        return "Vanilla Glaze";
    }
}
