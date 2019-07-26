package accessories;

public class GuitarString extends Accessory {

    private int gauge;

    public GuitarString(String name, int buyingPrice, int sellingPrice, int gauge) {
        super(name, buyingPrice, sellingPrice);
        this.gauge = gauge;
    }

    public int getGauge() {
        return this.gauge;
    }
}
