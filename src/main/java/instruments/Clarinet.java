package instruments;

public class Clarinet extends Instrument {

    private boolean hasCase;

    public Clarinet(Family family, String color, String material, String make, String model, int buyingPrice, int sellingPrice, boolean hasCase) {
        super(family, color, material, make, model, buyingPrice, sellingPrice);
        this.hasCase = hasCase;
    }

    public boolean hasCase() {
        return hasCase;
    }

    public String play() {
        return "Weee wooo!";
    }
}
