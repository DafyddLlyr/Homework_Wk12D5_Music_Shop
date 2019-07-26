package instruments;

import interfaces.IPlay;

public abstract class Instrument implements IPlay {

    private Family family;
    private String color;
    private String material;
    private String make;
    private String model;

    public Instrument(Family family, String color, String material, String make, String model) {
        this.family = family;
        this.color = color;
        this.material = material;
        this.make = make;
        this.model = model;
    }

    public Family getFamily() {
        return this.family;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
