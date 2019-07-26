import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MusicShopTest {

    MusicShop shop;
    Guitar guitar;

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
    }

    @Test
    public void canCalculateProfitOnComplexStock() {
    }
}
