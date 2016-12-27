package LinkedList;


public class LLMethods {
	public String Traversing(int x,Node head) {
		// TODO Auto-generated method stub
		int n = 0;
		while (head != null) {
			if (head.getData() < head.getNext().getData()) {
				head = head.getNext();
				n++;

			} else {
				if (n < x) {
					System.out.println("Unsorted LinkedList");
					return "Unsorted";
				} else {
					System.out.println("Sorted LinkedList");
					return "sorted";
				}
			}

		}
		return null;

	}

}
