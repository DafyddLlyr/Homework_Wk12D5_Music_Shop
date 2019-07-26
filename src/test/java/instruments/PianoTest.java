package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup() {
        piano = new Piano(Family.KEYBOARD, "Black", "Wood", "Mickson", "Canva", 20, 30, 110);
    }

    @Test
    public void hasHeightInCentimeters() {
        assertEquals(110, piano.getHeight());
    }

    @Test
    public void canPlay() {
        assertEquals("Plink plonk!", piano.play());
    }
}
