package labsession5;
class Book {

    String title;
    String author;
    int copiesAvaliable;

    Book(String title, String author, int copiesAvaliable) {
        this.title = title;
        this.author = author;
        this.copiesAvaliable = copiesAvaliable;
    }

    void getBookDetails() {
        System.out.println("\nBooks Details");
        System.out.println("Title " + title);
        System.out.println("Author " + author);
        System.out.println("Copies avalaible" + copiesAvaliable);
    }

    void addCopies(int newCopies) {
        if (newCopies > 0) {
            copiesAvaliable += newCopies;
        }
    }

    boolean borrowBook() {
        if (copiesAvaliable > 0) {
            copiesAvaliable--;
            return true;
        }
        return false;
    }
}

class Library {

    Book[] books;
    int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    int totalBooks() {
        return count;
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBookFromLibrary(String title) {
        Book book = findBookByTitle(title);

        if (book == null) {
            System.out.println("Book not found.");
        } else {
            if (book.borrowBook()) {
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Book is out of stock.");
            }
        }
    }


}

public class task6 {
    public static void main(String[] args) {

        Library library = new Library(5);

        Book b1 = new Book("Java Programming", "James Gosling", 3);
        Book b2 = new Book("Python Basics", "Guido van Rossum", 2);

        library.addBook(b1);
        library.addBook(b2);

        b1.getBookDetails();
        b2.getBookDetails();

        library.borrowBookFromLibrary("Java Programming");
        library.borrowBookFromLibrary("Java Programming");
        library.borrowBookFromLibrary("Java Programming");
        library.borrowBookFromLibrary("Java Programming");

        System.out.println("Total books in library: " + library.totalBooks());
    }
}
