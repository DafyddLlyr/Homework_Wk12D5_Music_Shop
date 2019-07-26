package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setup() {
        guitarString = new GuitarString("Extra Special Strings", 2, 5, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Extra Special Strings", guitarString.getName());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(2, guitarString.getBuyingPrice());
    }

    @Test
    public void canGetSellingTest() {
        assertEquals(5, guitarString.getSellingPrice());
    }

    @Test
    public void canGetGauge() {
        assertEquals(4, guitarString.getGauge());
    }

    @Test
    public void canSetSellingPrice() {
        guitarString.setSellingPrice(30);
        assertEquals(30, guitarString.getSellingPrice());
    }
}
