public class LinkedList<type> {
	private Node<type> head;
	
	public LinkedList() {
		head = null;
	}
	public LinkedList (Node<type> N) {
		head = N;
	}
	public void isEmpty() {
		head = null;
	}
	public void print() {
		Node<type> n = head;
		while(n != null){
			System.out.print("<" + n.getData() + "> ");
			n = n.getNext();
		}
	}
	public void insertAtFront(Node<type> N) {
		N.setNext(head);
		head = N;
	}
	public void insertAtEnd(Node<type> N) {
		Node<type> w = head;
		while(w.getNext() != null) {
			w = w.getNext();
		}
		w.setNext(N);
	}
	public void removeHead() {
		head = head.getNext();
	}
	public void removeEnd() {
		Node<type> backer = null;
		Node<type> n = head;
		while(n.getNext() != null) {
			backer = n;
			n = n.getNext();
		}
		backer.setNext(null);
	}
	public int removeNode(type data){
		Node<type> backer = null;
		Node<type> snaker = head;
		while(snaker != null){
			if(snaker.getData() == data){
				backer.setNext(snaker.getNext());
				return 1;
			}
			backer = snaker;
			snaker = snaker.getNext();
		}
		System.out.println(data + " does not exist in the linked list.");
		return 0;
	}
	public void removeNodeByAddress (Node<type> p) {
		Node<type> prev = head;
		while(prev.getNext() != p){
			prev = prev.getNext();
		}
		prev.setNext(p.getNext());
	}
	
	public Node<type> getNode(int i){
		Node<type> n = head;
		int current = 0;
		while(current < (i-1)){
			if(n == null){
				System.out.println("Index does not exist");
				return null;
			}else{
				n = n.getNext();
			}
			current++;
		}
		return n;
	}
	
	public int insertNode(Node<type> p, int i){
		Node<type> n = head;
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
		Node<type> temp = head;
		while(temp != null) {
			numOfNodes++;
			temp = temp.getNext();
		}
		return numOfNodes;
	}
	public void insertInOrder(Node<Integer> m) {
		//This method assumes list values are in increasing order.
		//Makes the assumption we are dealing with ints, will break otherwise
		@SuppressWarnings("unchecked")
		Node<Integer> n = (Node<Integer>) head;
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
		LinkedList<Integer> l = new LinkedList <Integer>(n);
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
		//l.removeEnd();
		//Print it out again with one less at the end
		l.print();
	}
}
