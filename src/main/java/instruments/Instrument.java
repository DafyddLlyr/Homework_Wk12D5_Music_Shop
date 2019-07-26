package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    protected Family family;
    private String color;
    private String material;
    private String make;
    private String model;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String color, String material, String make, String model, int buyingPrice, int sellingPrice) {
        this.color = color;
        this.material = material;
        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.family = null;
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

    public int getBuyingPrice() {
        return this.buyingPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int calculateMarkup() {
        return this.sellingPrice - this.buyingPrice;
    }
}
