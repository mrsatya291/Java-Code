package CircularLinkedList;

public class CircularLL {
	private static Node head,tail;
	CircularLL() {
		head = null;
	}

	
	public static void main(String... arg){
	
	
	Node A = new Node(1);
	Node B = new Node(2);
	Node C = new Node(3);
	Node D = new Node(4);
	Node E = new Node(5);
	Node F = new Node(6);
	CircularLL cl=new CircularLL();

	head=A;
	tail=D;
	A.setNext(B);
	B.setNext(C);
	C.setNext(D);
	D.setNext(E);
	E.setNext(F);
	F.setNext(A);
System.out.println(head);
System.out.println(F.getNext());
	

}
}