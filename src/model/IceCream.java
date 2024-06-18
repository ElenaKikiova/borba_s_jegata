package model;

import java.util.List;

public class IceCream {

    protected final String flavour;

    protected final double price;

    protected final List<String> ingredients;

    public IceCream(String flavour, double price, List<String> ingredients) {
        this.flavour = flavour;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getFlavour() {
        return flavour;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}
