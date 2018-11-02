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
		Node n = head;
		while(n != null){
			System.out.print("<" + n.getData() + "> ");
			n = n.getNext();
		}
	}
	public void insertAtFront(Node N) {
		N.setNext(head);
		head = N;
	}
	public void insertAtEnd(Node N) {
		Node w = head;
		while(w.getNext() != null) {
			w = w.getNext();
		}
		w.setNext(N);
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
		Node prev = head;
		while(prev.getNext() != p){
			prev = prev.getNext();
		}
		prev.setNext(p.getNext());
	}
	
	public int insertNode(Node p, int i){
		Node n = head;
		int current = 0;
		while(current < (i-1)){
			if(n == null){
				System.out.println("Index does not exist");
				return 0;
			}else{
				n = n.getNext();
			}
			current++;
		}
		p.setNext(n.getNext());
		n.setNext(p);
		return 1;
	}
	
	public int countNodes() {
		int numOfNodes = 0;
		Node temp = head;
		while(temp != null) {
			numOfNodes++;
			temp = temp.getNext();
		}
		return numOfNodes;
	}
	public void insertInOrder(Node m) {
		//This method assumes list values are in increasing order.
	}
	
	public static void  main(String[] args) {
		//Define the Nodes I'll be using for tests
		Node n2 = new Node();
		Node n1 = new Node(10,n2);
		Node n = new Node(25,n1);
		Node newFront = new Node(32);
		Node newEnd = new Node(19);
		Node insertNode = new Node(57);
		
		//Create a test LinkedList -> <25,10,1>
		LinkedList l = new LinkedList(n);
		//Test the class' methods
		//Insert a Node of value 35 at the front
		l.insertAtFront(newFront);
		//Should return a 4
		System.out.println(l.countNodes());
		//Insert a value of 19 at the end
		l.insertAtEnd(newEnd);
		//Print out the LinkedList so far
		l.print();
		System.out.println();
		//l.removeEnd();
		//Try the insert
		l.insertNode(insertNode, 8);
		//Print it out again with one less at the end
		l.print();
	}
}
