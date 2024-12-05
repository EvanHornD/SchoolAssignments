
public class Stack<T> {
	
	// Attributes *****************************************************************
	private Node<T> top;
	private int size;
	
    // Constructors ****************************************************************
	public Stack() {}


	public Stack(T data) {
		top = null;
		size = 1;
	}

    // Getters *********************************************************************
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}


	public void push(Object data) {
		Node<T> N = new Node<>(data,top);
		top = N;
		size++;
		
	}
	

	public Object pop() {
		if(top == null){
			return null;
		}
		Node<T> N = top;
		top = top.next;
		size--;
		return N.data;
	}

	
	public Object peek() {
		if(top == null){
			return null;
		}
		return top.data;
	}

	public void clear() {
		size = 0;
		top = null;
	}
	
	
	public boolean isEmpty() {
		return (top == null);
	}
	
}
