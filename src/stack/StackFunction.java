package stack;

public class StackFunction {
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
	 * 2.display - To print the output 
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
	 * Method to Print OutPut
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