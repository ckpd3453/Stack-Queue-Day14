package stack;

public class Main3 {

	public static void main(String[] args) {
		/** PROCEDURE
		 * =======================
		 * 1.creating Object 
		 * 2.Calling method to add value at first
		 * 3.calling method to display value of queue
		 * ============================= 
		 */
		
		/*
		 * 1.creating Object an Oject
		 */
		Queue queue = new Queue();
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
	}

}
