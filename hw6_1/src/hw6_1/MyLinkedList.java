package hw6_1;

//***************************
//���ϸ�:  MyLinkedList.java
//�ۼ���: 201632023 ������
//�ۼ���: 17. 10. 11.
//����: �ܼ����Ḯ��Ʈ ������ �����Ѵ�.
//***************************

public class MyLinkedList {
	// (1) �ν��Ͻ� ���� head ����: ���Ḯ��Ʈ�� ù��° ��带 ����Ŵ
	private Node head;
	private int count;// (2) ��Ÿ �ʿ��� �ν��Ͻ� ���� ����

	// (3) ����ִ� ����Ʈ�� ����
	public MyLinkedList(){
		head = null;
		count = 0;
	}

	// (4) ����Ʈ�� �� �տ� item�� ����
	public void addFirst(int item) {
		if(head==null)
		{
			Node newnode = new Node(item); // data �ʵ尡 item�� ���ο� Node ��ü�� ����(newNode)	
			head = newnode;
		}

		else
		{
			Node newnode = new Node(item, head);
			head = newnode;
		}
		count++;
		// head�� ����Ű�� ���Ḯ��Ʈ�� �� �տ� newNode�� ����
	}

	public void add(int index, int data){
		if(index > count || index < 0)
			System.out.println("���� �߻�. ���α׷��� �ٽ� ������ �ּ���.");

		if(index == 0)
			addFirst(data);

		else{
			Node temp = head;
			Node pre = null;

			pre = temp;

			for(int i = 0; i < index - 1; i++)
				pre = pre.link;

			pre.link = new Node(data, pre.link);
			count++;
		}
	}

	public int removeFirst(){
		if(head == null)
			System.out.println("���� �߻�. ���α׷��� �ٽ� ������ �ּ���.");

		Node temp = head;
		head = temp.link;
		count--;
		return temp.data;
	}	

	public int remove(int index){
		if(index >= count || index < 0)
			System.out.println("���� �߻�. ���α׷��� �ٽ� ������ �ּ���.");

		if(index == 0)
			return removeFirst();
		else{
			Node temp = head;
			Node pre = null;
			pre = temp;
			for(int i = 0; i < index - 1; i++)
				pre = pre.link;

			Node del = pre.link;

			pre.link = del.link;

			count--;
			return del.data;
		}
	}

	public boolean contains(int data){
		Node temp = head;
		Node con = null;

		while(temp != null){
			if(data == temp.data){
				con = temp;
				break;
			}
			else
				temp = temp.link;
		}	

		if(con != null)
			return true;
		else
			return false;
	}

	// (5) ����Ʈ�� ���̸� ����
	public int size(){
		return count;
	}

	// ����Ʈ ���ҵ��� ��� ���
	public void printList(){
		Node temp = head;

		System.out.print("[");

		if(temp != null){
			while(temp.link != null){
				System.out.print(temp.data);
				temp = temp.link;
				System.out.print(", ");
			}

			System.out.print(temp.data);
		}	

		System.out.println("]");

	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		Node temp = head;
		while(temp != null) {
			str.append(temp.data);
			temp = temp.link;
			if(temp != null)
				str.append(", ");
		}
		str.append("]");

		return str.toString();
	}

	// ���Ḯ��Ʈ ��� ������ ǥ���ϴ� private Ŭ����
	private class Node{
		int data;		// (6) �������� ������ ������ �ʵ� data ����
		Node link;		// (7) ���� ��� �������� ������ ��ũ �ʵ�link ����

		Node() {
			data = 0;
			link = null;
		}

		Node(int data) {
			this.data = data;
			this.link = null;
		}

		Node(int data, Node link) {
			this.data = data;
			this.link = link;
		}
	}

}
