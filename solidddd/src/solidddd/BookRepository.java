package solidddd;

import java.util.ArrayList;
import java.util.List;

class BookRepository implements CRUD<Book> {
    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    @Override
    public void create(Book obj) {
        books.add(obj);
    }

    @Override
    public Book read(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Book obj) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i, obj);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        books.removeIf(book -> book.getId() == id);
    }
}