import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before() {
        library = new Library(4);
        book = new Book(Genre.FICTION);
        book2 = new Book(Genre.NONFICTION);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryNotAtCapacity() {
        assertEquals(0, library.bookCount());
        assertTrue(library.notAtCapacity());
    }

    @Test
    public void libraryAtCapacity() {
        for (int i = 0; i < 6; i++) {
            library.add(book);
        }
        assertEquals(4, library.bookCount());
        assertFalse(library.notAtCapacity());
    }

    @Test
    public void canAddBookIfNotAtCapacity() {
        library.add(book);
        assertTrue(library.notAtCapacity());
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookIfAtCapacity() {
        for (int i = 0; i < 6; i++) {
            library.add(book);
        }
        assertFalse(library.notAtCapacity());
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canPopulateBooksByGenreHash() {
        library.add(book);
        library.add(book2);
        library.add(book2);
        library.populateBooksByGenreHash();
        assertEquals(1, library.bookCountByGenre(Genre.FICTION));
        assertEquals(2, library.bookCountByGenre(Genre.NONFICTION));
    }

}
