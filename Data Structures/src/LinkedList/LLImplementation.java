package LinkedList;

public class LLImplementation implements Method_interface {

	private static Node head;
	private static Node pointer;

	static int length = 0;
	int n = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node firstNode = new Node();
		Node secondNode = new Node();
		Node ThirdNode = new Node();
		Node fourthNode = new Node();
		Node fifthNode = new Node();

		firstNode.setData(10);
		firstNode.setNext(secondNode);
		secondNode.setData(90);
		secondNode.setNext(ThirdNode);
		ThirdNode.setData(30);
		ThirdNode.setNext(fourthNode);
		fourthNode.setData(40);
		fourthNode.setNext(fifthNode);
		fifthNode.setData(100);
		fifthNode.setNext(null);
		head = firstNode;
		pointer=head;
		/*
		 * System.out.println("Info of First Node:"+newnode.getData()+"\t"+
		 * newnode.getNext());
		 * System.out.println("Info of Second Node:"+secondNode.getData()+"\t"+
		 * secondNode.getNext());
		 */
		System.out.println("HEAD is Holding" + head.getData());
		LLImplementation lt = new LLImplementation();
		System.out.println("number of Nodes=" + lt.count());
		LLMethods lm=new LLMethods();
		System.out.println(lm.Traversing(length, pointer));

	}

	@Override
	public int count() {
		while (head != null) {
			head = head.getNext();
			length = length + 1;
		}
		return length;
	}

	@Override
	public String Traverse(int x) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Traverse(int x, Node pointer) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
