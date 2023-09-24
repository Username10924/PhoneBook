
public class Node {
	private Contact data;
	private Node next;
	public Node() {
		data = null;
		next = null;
	}
	public Node(Contact data) {
		this.data = data;
		next = null;
	}
	public Contact getData() {
		return data;
	}
	public void setData(Contact data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
