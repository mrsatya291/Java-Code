package Stack;

public class LinkedStack implements Operations {

	private Node top = null;
	int length = 0;
	int Rdata = 0;

	@Override
	public int push(int x) {
		// TODO Auto-generated method stub
		Node temp = new Node(x);

		temp.setNext(top);
		top = temp;
		length++;
		return length;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub

		Rdata = top.getData();
		top = top.getNext();
		length--;

		return Rdata;
	}

	public static void main(String[] arg) {

		LinkedStack lst = new LinkedStack();
		lst.push(20);
		lst.push(50);
		lst.push(10);
		lst.push(90);
		lst.push(200);
		System.out.println(lst.length);
		lst.pop();
		System.out.println(lst.Rdata);
		System.out.println(lst.length);

	}

}
