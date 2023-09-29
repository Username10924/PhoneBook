
public class Node {
	private Contact data;
	private Node next;
	private Node previous;
	public Node() {
		data = null;
		next = null;
		previous = null;
	}
	public Node(Contact data) {
		this.data = data;
		next = null;
		previous = null;
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
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
}
