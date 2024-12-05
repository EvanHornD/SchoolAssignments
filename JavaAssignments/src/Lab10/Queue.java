

public class Queue{
	/*	ATTRIBUTES: *********************************************/

	private int QUEUE_SIZE = 5;
	private Object[] items;
	private int front, back, count;


	/* CONSTRUCTOR: *********************************************/
	
	public Queue() { 
		items = new Object[QUEUE_SIZE];
		front = 0;
		back = QUEUE_SIZE -1;
		count = 0;
	}

	
	/* GETTERS: *************************************************/
	public int getSize() {
		return QUEUE_SIZE;
	}
	

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return false;
	}
	

	public Object dequeue(){
		return "";
	}
	

	
	public void enqueue(Object newItem){

	}		

	
	public void dequeueAll(){

	}


	
	public Object peek(){
		return "";
	}


	
	public int size(){
		return 0;
	}	 

	

	
}
