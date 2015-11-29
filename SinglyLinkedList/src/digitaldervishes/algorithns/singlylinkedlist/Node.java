package digitaldervishes.algorithns.singlylinkedlist;

public class Node {
	
	private int key;
	private Node next;
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public Node getNext() {
		return next;
	}
	public Node(int key, Node next) {
		super();
		this.key = key;
		this.next = next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	

}
