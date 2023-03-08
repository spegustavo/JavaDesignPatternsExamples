package pattern.dao;

public class DAOMain {
	
	public static void main(String[] args) {

        BookDAO bookDao = new BookDAOImpl();

        listBooks(bookDao);

        //update student
        Book book = bookDao.getAllBook().get(1);
        book.setBookName("Algorithms");
        bookDao.getAllBook().remove(1);
        bookDao.saveBook(book);
        
        listBooks(bookDao);
    }
	
	public static void listBooks(BookDAO bookDao) {
		for (Book book : bookDao.getAllBook()) {
            System.out.println("Book ISBN : " + book.getIsbn()+ " Book Name: "+book.getBookName());
        }
	}

}
