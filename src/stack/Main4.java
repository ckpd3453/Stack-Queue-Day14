package stack;

public class Main4 {

	public static void main(String[] args) {
		/**
		 * PROCEDURE 
		 * ======================= 
		 * 
		 * 1.creating Object 
		 * 2.Calling method to add value at first 
		 * 3.calling method to display value of queue
		 * 4.Calling method to deque till the stack is empty
		 * =============================
		 */

		/*
		 * 1.creating Object an Oject
		 */
		Queue4 queue = new Queue4();
		/*
		 * 2.Calling method to add
		 */
		queue.enque(56);
		queue.enque(30);
		queue.enque(70);

		/*
		 * 3.calling method to display value of stack
		 */
		queue.displayQueue();

		/*
		 * 4.deleting the top values of stack 56(first value) 30(second top) 70(third
		 * value) after deleting the stack is empty
		 * 
		 */
		queue.deque();
		queue.deque();
		queue.deque();
	}

}
