package stack;

public class Node2 {
	/*
	 * creating Object
	 */
	StackFunction2 List = new StackFunction2();
	
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
	/*
	 * deleting top value in the stack till stack gets empty
	 */
	public void pop() {
		while (List.head != null)
			List.deleteFirst();
	}
}
