package Stack;

public class Node {
	
	private int data;
	Node next;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public Node setNext(Node next) {
		return this.next = next;
	}

	Node(int x){
		data=x;
	}
	

}
