package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String color, String material, String make, String model, int buyingPrice, int sellingPrice, int numberOfStrings) {
        super(color, material, make, model, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.family = Family.STRING;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "Twang!";
    }

}
