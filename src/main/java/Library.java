import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    private Integer capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int numberOfBooks() {
        return this.books.size();
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public String checkStock(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        }
        return "library is full";
    };


}
