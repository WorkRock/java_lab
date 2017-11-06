package lab7_1;

public class MyArrayStack {
	private int[] stack = new int[10];
	private int top = -1;
	private int size = stack.length;
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return (top == size - 1);
	}
	
	public void push(int item) throws Exception{
		if(isFull())
			throw new Exception("Push실패. 배열이 꽉 차있습니다.");
		else {
			++top;
			stack[top] = item;
		}
	}
	
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Pop실패. 배열이 비어있습니다.");
		else {
			int s = stack[top];
			stack[top] = 0;
			--top;
			return s;
		}
	}
	
	public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Peek실패. 배열이 비어있습니다.");
		else {
			int s = stack[top];
			return s;
		}
	}
}
