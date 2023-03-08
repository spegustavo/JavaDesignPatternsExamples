package pattern.dao;

import java.util.List;

public interface BookDAO {
	
	List<Book> getAllBook();
    Book getBookByIsbn(int isbn);
    void saveBook(Book book);
    void deleteBook(Book book);
	
}
