package main;

public class Stack {
	private static final int CAPACITY = 5;
	private static int[] STACK_ARRAY = new int[CAPACITY];

	private int top;

	Stack() {
		top = -1;
	}

	boolean isFull() {
		return top == CAPACITY - 1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	public void push(int data) {
		if (isFull()) {
			System.err.println("Stack Overflow");
		} else {
			STACK_ARRAY[++top] = data;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.err.println("Stack Underflow");
			return 0;
		} else {
			int poppedElement = STACK_ARRAY[top--];
			return poppedElement;
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.err.println("Stack is Empty");
		} else {
			System.out.println("Top: " + top);
		}
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(STACK_ARRAY[i] + " ");
		}
	}
}
