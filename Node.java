public class Node<type> {
	private type data;
	private Node<type> next;
	public Node() {
		data = null;
		next = null;
	}
	public Node(type i){
		data = i;
		next = null;
	}
	public Node(type i, Node<type> n) {
		data = i;
		next = n;
	}
	public void setData(type m) {
		data = m;
	}
	public type getData() {
		return data;
	}
	public void setNext(Node<type> n) {
		next = n;
	}
	public Node<type> getNext() {
		return next;
	}
	
	//Driver Method
	public static void main(String[] args){
		Node<Integer> n = new Node<Integer>();
		Node<Integer> n3 = new Node<Integer>(25);
		Node<Integer> n2 = new Node<Integer>(20,n3);
		n.setData(10);
		n.setNext(n2);
		System.out.println(n3.getData());
		System.out.println(n.getNext().getData());
		n3.setNext(n);
		System.out.println(n3.getNext().getData());
	}
}
