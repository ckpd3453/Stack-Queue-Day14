package stack;

public class Queue {
	/*
	 * creating Object
	 */
	StackFunction3 List = new StackFunction3();
	
	/*
	 * calling method through object
	 */
	public void enque(Object data) {
		List.addLast(data);
		displayQueue();
	}

	/*
	 * calling method to display value in linkedList/Queue
	 */
	public void displayQueue() {
			List.display();
	}
	/*
	 * deleting top value in the stack till stack gets empty
	 */
	public void deque() {
			List.deleteFirst();
			displayQueue();
	}
}
