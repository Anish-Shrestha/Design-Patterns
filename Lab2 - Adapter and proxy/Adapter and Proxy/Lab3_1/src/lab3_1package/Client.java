package lab3_1package;

public class Client {
	public static void main(String[] args) {

		System.out.println("Stack Operation");
		TargetStack stack = new Adapter();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println("Pop:" + stack.pop());
		System.out.println("At top:" + stack.top());
		System.out.println("Is Empty:" + stack.isEmpty());
		stack.push("4");
		stack.push("5");
		System.out.println("At top:" + stack.top());
		System.out.println("Pop:" + stack.pop());
		System.out.println("Pop:" + stack.pop());
		System.out.println("Pop:" + stack.pop());
		System.out.println("Is Empty:" + stack.isEmpty());

		System.out.println("Queue Operation");
		TargetQueue queue = new Adapter();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		System.out.println("Deque:" + queue.dequeue());
		System.out.println("At front:" + queue.front());
		System.out.println("Is Empty:" + queue.isEmpty());
		queue.enqueue("4");
		queue.enqueue("5");
		System.out.println("At front:" + queue.front());
		System.out.println("Deque:" + queue.dequeue());
		System.out.println("Deque:" + queue.dequeue());
		System.out.println("Is Empty:" + queue.isEmpty());
	}
}
