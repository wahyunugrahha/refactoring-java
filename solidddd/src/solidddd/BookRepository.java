package solidddd;

import java.util.HashMap;
import java.util.Map;

public class BookRepository implements CRUD<Book> {
    private final Map<Integer, Book> books;

    public BookRepository() {
        this.books = new HashMap<>();
    }

    @Override
    public void create(Book obj) {
        books.put(obj.getId(), obj);
    }

    @Override
    public Book read(int id) {
        return books.get(id);
    }

    @Override
    public void update(int id, Book obj) {
        if (books.containsKey(id)) {
            books.put(id, obj);
        }
    }

    @Override
    public void delete(int id) {
        books.remove(id);
    }
}
