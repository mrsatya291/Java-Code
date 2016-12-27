package Tree;

public class BinaryTree {
	static Node root;
	public static void main(String...strings){
		root=new Node(1,"Root");
		Node n1=new Node(2,"Left1");
		Node n2=new Node(3,"right1");
		root.leftChild=n1;
		root.rightChild=n2;
		Node n3=new Node(4,"left2");
		Node n4=new Node(5,"right2");
		Node n5=new Node(6,"left3");
		
		n1.leftChild=n3;
		n1.rightChild=n4;
		n2.leftChild=n5;
		n2.rightChild=n5;
		
 	 	
		
		
		
		
		
		
	}
	
	
}
