import java.util.*;
//Make that stack stuff

interface Stack<object> {
	void push(object other);
	boolean isEmpty();
	object pop();
}

interface Queue<object>{
	void enqueue(object other);
	boolean isEmpty();
	object dequeue();
}

//end stack stuff


public class LinkedList<type> implements Stack<Node<type>>, Queue<Node<type>>{
	//Initialize Stack and Queue
	
	private Node<type> head;
	
	public LinkedList() {
		head = null;
	}
	public LinkedList (Node<type> N) {
		head = N;
	}
	public boolean isEmpty() {
		return (head == null);
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
		Node<type> n = head;
		Node<type> backer = null;
		while(n.getNext()!= null) {
			backer = n;
			n = n.getNext();
		}
		backer.setNext(null);
	}
	public void removeNode (Node<type> p) {
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
	
	public void insertNode(Node<type> p, type m){
		//Inserts Node before Node with the data in p
		Node<type> snaker = head;
		Node<type> backer = null;
		while(snaker != null){		
			if(snaker.getData() == m){
				backer.setNext(p);
				p.setNext(snaker);
				return;
			}
			backer = snaker;
			snaker = snaker.getNext();
		}
		System.out.println("There is no Node with the data inputted");
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
		/*Node<Integer> n2 = new Node<Integer>(30);
		Node<Integer> n1 = new Node<Integer>(25,n2);
		Node<Integer> n = new Node<Integer>(20,n1);
		Node<Integer> newFront = new Node<Integer>(10);
		Node<Integer> newEnd = new Node<Integer>(35);
		Node<Integer> insertNode = new Node<Integer>(23);
		Node<Integer> insertNode2 = new Node<Integer>(21);
		*/
		//Create a test LinkedList -> <25,10,1>
		System.out.print("Enter numbers and when done enter end:\n");
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		LinkedList<Integer> l = new LinkedList <Integer>(new Node<Integer>(Integer.parseInt(in)));
		in = s.nextLine();
		while(!in.contains("end")) {
			l.insertAtEnd(new Node<Integer>(Integer.parseInt(in)));
			in = s.nextLine();
		}
		s.close();
		//Test the class' methods
		//Insert a Node of value 35 at the front
		//l.insertAtFront(newFront);
		//Should return a 4
		System.out.println(l.countNodes());
		l.insertNode(new Node<Integer>(12), 15);
		
		//Test the Interface
		l.enqueue(new Node<Integer>(13));
		l.push(new Node<Integer>(115));
		System.out.println();
		l.print();
		l.dequeue();
		l.pop();
		System.out.println();
		l.print();
		
		
		
		
		//Insert a value of 19 at the end
		//l.insertAtEnd(newEnd);
		//Print out the LinkedList so far
		//l.print();
		//System.out.println();
		//l.removeEnd();
		//Try the insert
		//l.insertInOrder(insertNode);
		//Try the other insert
		//l.insertNode(insertNode2, 2);
		//Print it out again with one less at the end
		//l.print();
		
	}
	//This is the queue interface
	public void enqueue(Node<type> other) {
		this.insertAtEnd(other);
		
	}
	public Node<type> dequeue() {
		Node<type> returns = this.getNode(0);
		this.removeHead();
		return returns;
	}
	
	//This is the stack interface
	public void push(Node<type> other) {
		this.insertAtEnd(other);
	}
	public Node<type> pop() {
		Node<type> returns = this.getNode(this.countNodes());
		this.removeEnd();
		return returns;
	}
}
