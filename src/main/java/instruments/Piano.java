package instruments;

public class Piano extends Instrument {

    private int heightInCentimeters;

    public Piano(String color, String material, String make, String model, int buyingPrice, int sellingPrice, int heightInCentimeters) {
        super(color, material, make, model, buyingPrice, sellingPrice);
        this.heightInCentimeters = heightInCentimeters;
        this.family = Family.KEYBOARD;
    }

    public int getHeight() {
        return this.heightInCentimeters;
    }

    public String play() {
        return "Plink plonk!";
    }

}
