import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Book book2;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book(Genre.FICTION);
        book2 = new Book(Genre.NONFICTION);
        library = new Library(4);
    }

    @Test
    public void canAddBook() {
        borrower.add(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBookIfLibraryNotEmpty() {
        library.add(book);
        assertEquals(1, library.bookCount());
        borrower.borrow(library);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void cannotBorrowBookIfLibraryEmpty() {
        assertEquals(0, library.bookCount());
        borrower.borrow(library);
        assertEquals(0, borrower.bookCount());
    }

}
