package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(Family family, String color, String material, String make, String model, int numberOfValves) {
        super(family, color, material, make, model);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return this.numberOfValves;
    }

    public String play() {
        return "Bwap bwaaa!";
    }
}
