public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	public LinkedList (Node N) {
		head = N;
	}
	public void isEmpty() {
		head = null;
	}
	public void print() {
		
	}
	public Node getToEnd(Node n) {
		n = head;
		while(n.getNext() != null) {
			n = n.getNext();
		}
		return n;
	}
	public void insertAtFront(Node N) {
		N.setNext(head);
		head = N;
	}
	public void insertAtEnd(Node N) {
		getToEnd(head).setNext(N);
	}
	public void removeHead() {
		head = head.getNext();
	}
	public void removeEnd() {
		Node n = head;
		while(n.getNext().getNext() != null) {
			n = n.getNext();
		}
		n.setNext(null);
	}
	public void removeNode (Node p) {
		
	}
	
	public int countNodes() {
		int numOfNodes = 1;
		Node temp = head;
		while(temp.getNext() != null) {
			numOfNodes++;
			temp = temp.getNext();
		}
		return numOfNodes;
	}
	public void insertInOrder(Node m) {
		//This method assumes list values are in increasing order.
	}
	
	public static void  main(String[] args) {
		Node n2 = new Node();
		Node newFront = new Node();
		Node n1 = new Node(10,n2);
		Node n = new Node(25,n1);
		
		LinkedList l = new LinkedList(n);
		System.out.println(l.countNodes());
		l.insertAtFront(newFront);
		System.out.println(l.countNodes());
	}
}
