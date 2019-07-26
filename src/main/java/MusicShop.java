import interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;
    private String name;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

}
