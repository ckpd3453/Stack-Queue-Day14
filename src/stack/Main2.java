package stack;

public class Main2 {

	public static void main(String[] args) {
		/** PROCEDURE
		 * =======================
		 * 1.creating Object 
		 * 2.Calling method to push value to stack
		 * 3.calling method to display value of stack
		 * 4.Calling method to pop value from first till stack get empty
		 * 5.Calling method to display
		 * ============================= 
		 */
		
		/*
		 * 1.creating Object an Oject
		 */
		Node2 stack = new Node2();
		/*
		 * 2.Calling method to push value to stack
		 */
		stack.push(70);
		stack.push(30);
		stack.push(56);
		/*
		 * 3.calling method to display value of stack
		 */
		stack.displayStack();
		/*
		 * 4.poping the value till stack gets empty
		 */
		stack.pop();
		/*
		 * 5.calling method to display value of stack
		 */
		stack.displayStack();

	}

}
