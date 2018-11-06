public class LinkedList {
	private Node<Integer> head;
	
	public LinkedList() {
		head = null;
	}
	public LinkedList (Node<Integer> N) {
		head = N;
	}
	public void isEmpty() {
		head = null;
	}
	public void print() {
		Node<Integer> n = head;
		while(n != null){
			System.out.print("<" + n.getData() + "> ");
			n = n.getNext();
		}
	}
	public void insertAtFront(Node<Integer> N) {
		N.setNext(head);
		head = N;
	}
	public void insertAtEnd(Node<Integer> N) {
		Node<Integer> w = head;
		while(w.getNext() != null) {
			w = w.getNext();
		}
		w.setNext(N);
	}
	public void removeHead() {
		head = head.getNext();
	}
	public void removeEnd() {
		Node<Integer> n = head;
		while(n.getNext().getNext() != null) {
			n = n.getNext();
		}
		n.setNext(null);
	}
	public void removeNode (Node<Integer> p) {
		Node<Integer> prev = head;
		while(prev.getNext() != p){
			prev = prev.getNext();
		}
		prev.setNext(p.getNext());
	}
	
	public int insertNode(Node<Integer> p, int i){
		Node<Integer> n = head;
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
		Node<Integer> temp = head;
		while(temp != null) {
			numOfNodes++;
			temp = temp.getNext();
		}
		return numOfNodes;
	}
	public void insertInOrder(Node<Integer> m) {
		//This method assumes list values are in increasing order.
		Node<Integer> n = head;
		while(n.getNext() != null && (m.getData() > n.getNext().getData())){
			n = n.getNext();
		}
		m.setNext(n.getNext());
		n.setNext(m);
	}
	
	public static void  main(String[] args) {
		//Define the Nodes I'll be using for tests
		Node<Integer> n2 = new Node<Integer>(30);
		Node<Integer> n1 = new Node<Integer>(25,n2);
		Node<Integer> n = new Node<Integer>(20,n1);
		Node<Integer> newFront = new Node<Integer>(10);
		Node<Integer> newEnd = new Node<Integer>(35);
		Node<Integer> insertNode = new Node<Integer>(23);
		Node<Integer> insertNode2 = new Node<Integer>(21);
		
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
		l.insertInOrder(insertNode);
		//Try the other insert
		l.insertNode(insertNode2, 2);
		//Print it out again with one less at the end
		l.print();
	}
}
