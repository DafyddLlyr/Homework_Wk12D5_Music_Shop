package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void setup() {
        clarinet = new Clarinet(Family.WOODWIND, "Black", "Wood", "Smiths", "A200", 10, 20, true);
    }

    @Test
    public void canCheckIfHasCase() {
        assertTrue(clarinet.hasCase());
    }

    @Test
    public void canPlay() {
        assertEquals("Weee wooo!", clarinet.play());
    }
}
