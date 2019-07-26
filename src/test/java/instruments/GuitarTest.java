package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup() {
        guitar = new Guitar(Family.STRING, "Blue", "Wood", "Fender", "DX120", 5);
    }

    @Test
    public void hasFamily() {
        assertEquals(Family.STRING, guitar.getFamily());
    }

    @Test
    public void hasColor() {
        assertEquals("Blue", guitar.getColor());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("DX120", guitar.getModel());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Twang!", guitar.play());
    }
}
