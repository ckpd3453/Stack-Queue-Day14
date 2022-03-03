package stack;

public class StackFunction2 {
	Node head;

	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}
	/** Process
	 *  ==============
	 * 
	 * 1.addFirst - To add the elements in stack
	 * 2. deleteFirst - To delete the first value of satck till it gets empty.
	 * 3. display - To print the output 
	 */

	/*
	 * 1. Method to add elements
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
	 * 4.method to delete first value till the stack gets empty
	 */
	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements present to delete");
		else
			System.out.println("Poping value");
		head = head.next;
	}
	
	/*
	 *3. Method to Print OutPut
	 */
	public void display() {
		if (head == null) {
			System.out.println("No elements to display");
		} else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}