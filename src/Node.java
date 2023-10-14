
public class Node<T> {
	private T data;
	private Node<T> next;
	private Node<T> previous;
	public Node() {
		data = null;
		next = null;
		previous = null;
	}
	public Node(T data) {
		this.data = data;
		next = null;
		previous = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
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
