package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String color, String material, String make, String model, int buyingPrice, int sellingPrice, int numberOfValves) {
        super(color, material, make, model, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
        this.family = Family.BRASS;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String play() {
        return "Bwap bwaaa!";
    }
}
