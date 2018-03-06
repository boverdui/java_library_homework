import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<Genre, Integer> booksByGenreHash;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
        this.booksByGenreHash = new HashMap<>();
    }

    public int bookCount() {
        return this.collection.size();
    }


    public Boolean notAtCapacity() {
        return this.collection.size() < this.capacity;
    }

    public void add(Book book) {
        if (notAtCapacity()) {
            this.collection.add(book);
        }
    }

    public Book remove() {
        return this.collection.remove(0);

    }

    public void populateBooksByGenreHash() {
        for(Genre genre : Genre.values()) {
            int count = 0;
            for(Book book : this.collection) {
                if(genre == book.getGenre()) {
                    count++;
                }
            }
            this.booksByGenreHash.put(genre, count);
        }
    }

    public int bookCountByGenre(Genre genre) {
        return this.booksByGenreHash.get(genre);
    }

}
