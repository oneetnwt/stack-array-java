package main;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.display();

		stack.peek();

		System.out.println("Popped: " + stack.pop());
		stack.display();

		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		stack.pop();
	}
}
