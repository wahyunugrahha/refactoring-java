package solidddd;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        BookController controller = new BookController(repository);
        BookView view = new BookView(controller);
        view.start();
    }
}
