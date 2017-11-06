package lab7_2;


public class MyLinkedStack {
	private Node top = null;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(int item) {
		Node newNode = new Node();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}
	
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Pop실패. 원소가 없습니다.");
		else {
			int c = top.data;
			top = top.link;
			return c;
		}
	}
	
	public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Peek실패. 원소가 없습니다.");
		else {
			return top.data;
		}
	}
	
	private class Node{
		int data;
		Node link;
	}
}