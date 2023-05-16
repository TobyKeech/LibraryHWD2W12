import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;

    Book book;

    @Before
    public void setUp(){
        library = new Library(60);
        book = new Book ("Gerosore", "Toby Keech", "historic");
    }

    @Test
    public void testNumberOfBooksInLibrary(){
        assertEquals(0, library.numberOfBooks());
    }

    @Test
    public void testCanAddABookToLibrary(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.numberOfBooks());
    }

    @Test
    public void testCanAddIfSpace(){
        assertEquals("library is full", library.checkStock(book));

    }









}
