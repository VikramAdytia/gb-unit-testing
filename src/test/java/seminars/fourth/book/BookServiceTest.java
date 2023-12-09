package seminars.fourth.book;


import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        Mockito.when(bookRepository.findById("1"))
                .thenReturn(new Book("1", "Book1", "Author1"));

        Mockito.when(bookRepository.findAll())
                .thenReturn(Arrays.asList(
                        new Book("1", "Book1", "Author1"),
                        new Book("2", "Book2", "Author2")
                ));
    }

    @Test
    public void testFindBookById() {
        BookService bookService = new BookService(bookRepository);

        Book book = bookService.findBookById("1");

        assertNotNull(book);
        assertEquals("1", book.getId());
        assertEquals("Book1", book.getTitle());
        assertEquals("Author1", book.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookService bookService = new BookService(bookRepository);

        List<Book> books = bookService.findAllBooks();

        assertNotNull(books);
        assertEquals(2, books.size());
        assertEquals("1", books.get(0).getId());
        assertEquals("2", books.get(1).getId());
    }
}
