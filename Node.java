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
}
