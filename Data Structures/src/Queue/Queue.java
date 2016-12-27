package Queue;

public class Queue {
	private int[] object;
	private int front;
	private int rear;
	private int queueSize;
	
	public Queue(){
		queueSize=10;
		object=new int[queueSize];
		front=-1;
		rear=-1;
	}
	public void eQueue(int data)
	{
		if((front+1)>=queueSize){
			resize();}
			object[front+1]=data;
			front++;
		
	}
	public int deQueue(){
		if(front>rear)
			return object[++rear];
		
		return -1;
		
		
	}
	
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRear() {
		return rear;
	}
	public void setRear(int rear) {
		this.rear = rear;
	}
	public boolean isEmpty(){
		return front<=rear;
	}
	private void resize() {
		// TODO Auto-generated method stub
		
		int[] temp=object;
		queueSize=queueSize*2;
		object =new int[queueSize];
		
		for(int i=0;i<=front;i++){
			object[i]=temp[i];
			
		}
		
		
		
	}

}
