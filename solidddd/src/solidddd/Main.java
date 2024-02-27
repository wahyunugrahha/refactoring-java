package solidddd;

interface CRUD<T> {
    void create(T obj);
    T read(int id);
    void update(int id, T obj);
    void delete(int id);
}

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        BookController controller = new BookController(repository);
        BookView view = new BookView(controller);
        view.start();
    }
}
