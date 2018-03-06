import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;
    Book book2;


    @Before
    public void before() {
        book = new Book(Genre.FICTION);
        book2 = new Book(Genre.NONFICTION);
    }

    @Test
    public void canGetGenre() {
        assertEquals(Genre.FICTION, book.getGenre());
        assertEquals(Genre.NONFICTION, book2.getGenre());
    }

}
