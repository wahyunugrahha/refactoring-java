package solidddd;
// BookView.java
import java.util.Scanner;

public class BookView {
    private final Scanner scanner;
    private final BookController controller;

    public BookView(BookController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    findBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    scanner.close(); 
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void addBook() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Judul: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.print("Penulis: ");
        String author = scanner.nextLine();
        controller.addBook(id, title, author);
    }

    private void findBook() {
        System.out.print("ID Buku: ");
        int bookId = scanner.nextInt();
        Book book = controller.findBook(bookId);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    private void updateBook() {
        System.out.print("ID Buku yang akan diubah: ");
        int updateId = scanner.nextInt();
        System.out.print("Judul baru: ");
        scanner.nextLine();
        String newTitle = scanner.nextLine();
        System.out.print("Penulis baru: ");
        String newAuthor = scanner.nextLine();
        controller.updateBook(updateId, newTitle, newAuthor);
    }

    private void deleteBook() {
        System.out.print("ID Buku yang akan dihapus: ");
        int deleteId = scanner.nextInt();
        controller.deleteBook(deleteId);
    }
}
