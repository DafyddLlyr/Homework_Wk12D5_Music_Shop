package instruments;

public class Clarinet extends Instrument {

    private boolean hasCase;

    public Clarinet(String color, String material, String make, String model, int buyingPrice, int sellingPrice, boolean hasCase) {
        super(color, material, make, model, buyingPrice, sellingPrice);
        this.hasCase = hasCase;
        this.family = Family.WOODWIND;
    }

    public boolean hasCase() {
        return this.hasCase;
    }

    public String play() {
        return "Weee wooo!";
    }

}
