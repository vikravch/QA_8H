
public class Book {

	private int id;
	private String name;
	private int status;
	
	public Book(int id, String name, int status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
}