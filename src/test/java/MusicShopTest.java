import accessories.GuitarString;
import books.Book;
import books.Category;
import instruments.Clarinet;
import instruments.Guitar;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MusicShopTest {

    private MusicShop shop;
    private Guitar guitar;

    @Before
    public void setup() {
        shop = new MusicShop("Dafydd's Music Emporium");
        guitar = new Guitar("Red", "Wood", "Fender", "AX2100", 10, 20, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Dafydd's Music Emporium", shop.getName());
    }

    @Test
    public void canSetName() {
        shop.setName("Dafydd's Music Shack");
        assertEquals("Dafydd's Music Shack", shop.getName());
    }

    @Test
    public void canCountStock() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStockToShop() {
        shop.addItem(guitar);
        assertEquals(1, shop.stockCount());
        assertTrue(shop.getStock().contains(guitar));
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canCalculateProfitOnSingleStock() {
        shop.addItem(guitar);
        assertEquals(10, shop.calculateProfit());
    }

    @Test
    public void canCalculateProfitOnComplexStock() {
        GuitarString guitarString = new GuitarString("Extra Special Strings", 2, 5, 4);
        Book book = new Book("Guitar for Dummies", "Tim Matthews", Category.BEGINNER_LESSONS, 10, 20);
        Clarinet clarinet = new Clarinet("Black", "Wood", "Smiths", "A200", 10, 20, true);
        Piano piano = new Piano("Black", "Wood", "Mickson", "Canva", 20, 30, 110);
        Trumpet trumpet = new Trumpet("Gold", "Brass", "Dixon", "Ruby", 100, 110, 4);

        shop.addItem(guitar);
        shop.addItem(book);
        shop.addItem(clarinet);
        shop.addItem(piano);
        shop.addItem(trumpet);
        shop.addItem(guitarString);

        assertEquals(53, shop.calculateProfit());
    }
}
