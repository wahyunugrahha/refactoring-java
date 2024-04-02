package solidddd;

public class BookController {
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(int id, String title, String author) {
        Book newBook = new Book(id, title, author);
        repository.create(newBook);
    }

    public Book findBook(int id) {
        return repository.read(id);
    }

    public void updateBook(int id, String title, String author) {
        Book existingBook = repository.read(id);
        if (existingBook != null) {
            existingBook.setTitle(title);
            existingBook.setAuthor(author);
            repository.update(id, existingBook);
        }
    }

    public void deleteBook(int id) {
        repository.delete(id);
    }
}
