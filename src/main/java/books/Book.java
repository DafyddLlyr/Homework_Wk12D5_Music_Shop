package books;

import interfaces.ISell;

public class Book implements ISell {

    private String title;
    private String author;
    private Category category;
    private int buyingPrice;
    private int sellingPrice;

    public Book(String title, String author, Category category, int buyingPrice, int sellingPrice) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Category getCategory() {
        return this.category;
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
