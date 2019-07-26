package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(Family family, String color, String material, String make, String model, int numberOfStrings) {
        super(family, color, material, make, model);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "Twang!";
    }
}
