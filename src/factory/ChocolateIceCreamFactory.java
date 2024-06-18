package factory;

import model.IceCream;
import model.Flavour;

import java.util.List;

public class ChocolateIceCreamFactory implements IceCreamFactory {

    @Override
    public IceCream prepareIceCream() {
        return new IceCream(
                Flavour.CHOCOLATE.getFlavour(),
                3.5,
                List.of("Milk", "Cocoa powder", "Sugar", "Palm Oil"));
    }
}
