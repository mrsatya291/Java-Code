package Queue;

public class ImplementQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue=new Queue();
		queue.eQueue(10);
		queue.eQueue(20);
		queue.eQueue(30);
		queue.eQueue(40);
		queue.eQueue(50);
		queue.eQueue(60);
		queue.eQueue(70);
		queue.eQueue(80);
		queue.eQueue(90);
		queue.eQueue(100);
		queue.eQueue(110);
		queue.eQueue(120);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		queue.eQueue(10000);
		queue.eQueue(-8);
		queue.eQueue(-80);
		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		
		
		
		
		

	}

}
