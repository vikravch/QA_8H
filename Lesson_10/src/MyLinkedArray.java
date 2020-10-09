
public class MyLinkedArray {
	private int size = 0;
	private Node first = null;
	private Node last = null;
	
	public void add(String value) { // == addLast
		
		Node newNode = new Node(value);
		if (first==null) {
			// added first element to new chain
			first = newNode;
			last = newNode;
		} else {
			// added next element for last node
			last.setNext(newNode);
			last = newNode;
		}
		size++;
	}
	
	// Добавление значения в начало цепи
	public void addFirst(String value) {
		Node newNode = new Node(value);
		if (size==0) {
			first = newNode;
			last = newNode;
		} else {
			newNode.setNext(first);
			first = newNode;			
		}
		size++;
	}
	// Добавление значения в хвост цепи 
	public void addLast(String value) {
		add(value);
	}
	
	
	// Добавление значения на позицию index 
	public void addAtIndex(String value, int index) {
		// 0. crazy indexes
		if (index<0 || index>size) return;
		// 1. empty chain
		if (size==0 && index==0) {
			addFirst(value);
		}
		// 2. we want to add to first index
		if (index==0) {
			addFirst(value);
		}
		// 3. we want to add to last index
		if (index==size) {
			addLast(value);
		}
		// 4. we want to add to the middle of chain
		if(index>0 && index<size) {
			Node newNode = new Node(value);
			Node oldIndex = getIndex(index-1);
			newNode.setNext(oldIndex.getNext());
			oldIndex.setNext(newNode);
		}
	}
	
	// first                  last
	// [ 1 -> 3 -> 32 -> 12 -> 31  ]
	//   0    1    2      3    4   
	
	//            12->
	// 1. [ 1 -> 3 -> 32 -> 12 -> 31  ]
	//   	0    1    2      3    4   
	
	//  		   12->
	// 2. [ 1 -> 3 X> 32 -> 12 -> 31  ]
	//   	0    1    2      3    4   
	
	//            
	// 3. [ 1 -> 3 -> 12-> 32 -> 12 -> 31  ]
	//   	0    1    2      3    4   
	
	public Node getIndex(int index) {
		Node current = first;
		int currentIndex = 0;
		while(currentIndex < index) {
			current = current.getNext();
			currentIndex++;
		}
		return current;
	}

	//   value = 12   index = 2
	public void display() {
		Node current = first;
		System.out.print(current.getName()+"->");
		while(current.getNext()!=null) {
			current = current.getNext();
			System.out.print(current.getName()+"->");
		}
		System.out.println();
	}
	
}
