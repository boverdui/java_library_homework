import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void add(Book book) {
        this.collection.add(book);
    }

    public void borrow(Library library) {
        if(library.bookCount() > 0) {
            Book book = library.remove();
            add(book);
        }
    }

}
