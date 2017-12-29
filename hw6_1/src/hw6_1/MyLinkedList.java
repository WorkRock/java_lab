package hw6_1;

//***************************
//파일명:  MyLinkedList.java
//작성자: 201632023 이지훈
//작성일: 17. 10. 11.
//설명: 단순연결리스트 구현을 연습한다.
//***************************

public class MyLinkedList {
	// (1) 인스턴스 변수 head 선언: 연결리스트의 첫번째 노드를 가리킴
	private Node head;
	private int count;// (2) 기타 필요한 인스턴스 변수 선언

	// (3) 비어있는 리스트를 생성
	public MyLinkedList(){
		head = null;
		count = 0;
	}

	// (4) 리스트의 맨 앞에 item을 삽입
	public void addFirst(int item) {
		if(head==null)
		{
			Node newnode = new Node(item); // data 필드가 item인 새로운 Node 객체를 생성(newNode)	
			head = newnode;
		}

		else
		{
			Node newnode = new Node(item, head);
			head = newnode;
		}
		count++;
		// head가 가리키는 연결리스트의 맨 앞에 newNode를 삽입
	}

	public void add(int index, int data){
		if(index > count || index < 0)
			System.out.println("오류 발생. 프로그램을 다시 실행해 주세요.");

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
			System.out.println("오류 발생. 프로그램을 다시 실행해 주세요.");

		Node temp = head;
		head = temp.link;
		count--;
		return temp.data;
	}	

	public int remove(int index){
		if(index >= count || index < 0)
			System.out.println("오류 발생. 프로그램을 다시 실행해 주세요.");

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

	// (5) 리스트의 길이를 리턴
	public int size(){
		return count;
	}

	// 리스트 원소들을 모두 출력
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

	// 연결리스트 노드 구조를 표현하는 private 클래스
	private class Node{
		int data;		// (6) 정수값을 저장할 데이터 필드 data 선언
		Node link;		// (7) 다음 노드 참조값을 저장할 링크 필드link 선언

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
