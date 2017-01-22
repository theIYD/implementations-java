
public class Stack {

	/* Implement Stack */

	private int maximumSize;
	private long[] stackArray;
	private int top;

	public Stack(int s) {
		maximumSize = s;
		stackArray = new long[maximumSize];
		top = -1;

	}

	public void push(long z) {
		stackArray[++top] = z;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top==-1);
	}

	public boolean isFull() {
		return (top == maximumSize -1);
	}

	public static void main(String[] args) {
		Stack stack = new Stack(15);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		while(!stack.isEmpty()) {
			long temp = stack.pop();
			System.out.print(temp);
			System.out.print(" ");
		}

		System.out.println("");
	}
}