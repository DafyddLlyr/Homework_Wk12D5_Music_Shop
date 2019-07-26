package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setup() {
        trumpet = new Trumpet("Gold", "Brass", "Dixon", "Ruby", 100, 110, 4);
    }

    @Test
    public void hasNumberOfVales() {
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Bwap bwaaa!", trumpet.play());
    }
}
