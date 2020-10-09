
public class Node {

	private String name;
	private Node next = null;
	
	public Node(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		return name+"->";
	}
}