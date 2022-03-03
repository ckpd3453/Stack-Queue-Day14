package stack;

public class Node {
	/*
	 * creating Object
	 */
	StackFunction List = new StackFunction();
	
	/*
	 * calling method through object
	 */
	public void push(Object data) {
		List.addFirst(data);
	}

	/*
	 * calling method to display value in linkedList/stack
	 */
	public void displayStack() {
			List.display();
	}
}
