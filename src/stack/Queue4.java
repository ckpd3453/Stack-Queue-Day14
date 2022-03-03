package stack;

public class Queue4 {
	/*
	 * creating Object
	 */
	StackFunction4 List = new StackFunction4();

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
