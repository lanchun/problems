package problems;

public class Node<T> {
	public T item;
	public Node<T> next;
	
	public Node(){}
	
	public Node(T item) {
		this.item = item;
	}

	public Node(T item, Node<T> next) {
		this(item);
		this.next = next;
	}
	
}
