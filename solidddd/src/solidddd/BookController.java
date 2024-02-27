package solidddd;

class BookController {
    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(int id, String title, String author) {
        repository.create(new Book(id, title, author));
    }

    public Book findBook(int id) {
        return repository.read(id);
    }

    public void updateBook(int id, String title, String author) {
        Book book = repository.read(id);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
            repository.update(id, book);
        }
    }

    public void deleteBook(int id) {
        repository.delete(id);
    }
}