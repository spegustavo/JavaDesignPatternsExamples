package pattern.dao;

import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

	//list is working as a database
    private List<Book> books;

    public BookDAOImpl() {
    	books = new ArrayList<>();
    	books.add(new Book(1, "Java"));
    	books.add(new Book(2, "Python"));
    	books.add(new Book(3, "Android"));
    }

    @Override
    public List<Book> getAllBook() {
        return books;
    }

    @Override
    public Book getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Book book) {
    	books.add(book);
    }

    @Override
    public void deleteBook(Book book) {
    	books.remove(book);
    }

}
