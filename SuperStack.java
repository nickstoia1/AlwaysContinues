
public class SuperStack<T>{
	private T[] items;
	private int top;
	
	public SuperStack() {
		this(1);
	}
	public SuperStack(int size){
		items = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == items.length;
	}
	
	public boolean push(T item) {
		if (isFull()) {
			return false;
		}
		items[top] = item;
		top++;
		return true;
	}
	
	public T pop() {
		if (isEmpty()) {
			return null;
		}
		else {
			top = top - 1;
			return items[top];
		}
	}
	public T peek() {
		if (isEmpty()) {
			return null;
		}
		else {
			return items[top - 1];
		}
	}
	
	public void displayElements() {
		// TODO
	}
	

}
