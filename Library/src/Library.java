import java.util.ArrayList;

public class Library {

	private ArrayList<Book> books = new ArrayList<>();
	
	// add book
	// print book
	// get book by id
	// print library
	// change status
	// get book
	// take book
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void printBook(int id) {
		Book book = getBookById(id);
		System.out.println(book);
	}
	
	public Book getBookById(int id) {
		for(Book currentBook:books) {
			if (currentBook.getId()==id) {
				return currentBook;
			}
		}
		return null;
	}
	
	public void printLibrary() {
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
