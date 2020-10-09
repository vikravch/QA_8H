
public class Main {

	public static void main(String[] args) {
		
		Node first = new Node("AAAA");
		Node second = new Node("BBBB");
		Node third = new Node("CCCC");
		Node fourth = new Node("DDDD");
		
		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		// fourth <- third <- second <- first
		
		Node current = first;
		System.out.println(current.getName());
		while(current.getNext()!=null) {
			current = current.getNext();
			System.out.println(current.getName());
		}
		
		
		/*Node node1 = new Node("Node1");
		Node node2 = new Node("Node2");
		Node node3 = new Node("Node3");
		Node node4 = new Node("Node4");
		Node node5 = new Node("Node5");
		Node node6 = new Node("Node6");
		Node node7 = new Node("Node7");*/
		System.out.println("----------------------------");
		MyLinkedArray myArray = new MyLinkedArray();
		myArray.add("Node1");
		//myArray.display();
		myArray.add("Node2");
		myArray.add("Node3");
		myArray.add("Node4");
		myArray.display();
		
		System.out.println(myArray.getIndex(1));
		myArray.addAtIndex("NodeNew", 2);
		myArray.display();
	}

}
