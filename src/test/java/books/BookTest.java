package books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setup() {
        book = new Book("Guitar for Dummies", "Tim Matthews", Category.BEGINNER_LESSONS, 10, 20);
    }

    @Test
    public void hasTitle() {
        assertEquals("Guitar for Dummies", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Tim Matthews", book.getAuthor());
    }

    @Test
    public void hasCategory() {
        assertEquals(Category.BEGINNER_LESSONS, book.getCategory());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(10, book.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(20, book.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, book.calculateMarkup());
    }
}
