public class Node {
	private int data;
	private Node next;
	public Node() {
		data = 1;
		next = null;
	}
	public Node(int i){
		data = i;
		next = null;
	}
	public Node(int i, Node n) {
		data = i;
		next = n;
	}
	public void setData(int m) {
		data = m;
	}
	public int getData() {
		return data;
	}
	public void setNext(Node n) {
		next = n;
	}
	public Node getNext() {
		return next;
	}
}
