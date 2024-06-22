package decorator;

import model.Flavour;
import model.IceCream;

import java.util.List;

public class StrawberryJamDecorator extends IceCreamToppingDecorator {

    public StrawberryJamDecorator(IceCream iceCream) {
        super(Flavour.STRAWBERRY.getFlavour() ,
                1.25,
                List.of("Sugar", "Strawberries", "Jelatin", "Citric acid"),
                iceCream);
    }

    @Override
    protected String getToppingName() {
        return "Strawberry Jam";
    }
}
