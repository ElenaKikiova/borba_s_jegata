package model;

public enum Flavour {
    CHOCOLATE("Chocolate ice cream"),
    VANILLA("Vanilla ice cream"),
    STRAWBERRY("Strawberry ice cream");

    private final String flavour;

    Flavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
