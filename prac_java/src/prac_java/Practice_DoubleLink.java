package prac_java;

/*
 * 파일명: MyDoublyLinkedList.java
 * 작성자: 201632023 이지훈
 * 작성일: 17. 10. 11.
 * 내용: 이중연결자료구조로 선형리스트를 구현한 MyDoublyLinkedList 클래스
 */

public class Practice_DoubleLink {

	private Node head;	// 리스트의 첫번째 노드를 가리킬 변수
	private int count;	// 리스트의 원소 수를 나타내는 변수

	// 리스트 길이를 리턴
	public int size() {
		return count;
	}

	public Practice_DoubleLink() {
		head = null;
		count = 0;
	}

	// 리스트의 맨 앞에 item을 삽입
	public void addFirst(int item) {

		// (1) 데이터가 item인 새로운 노드 생성
		Node newNode = new Node(item);

		// (2) 새로운 노드를 리스트의 맨 앞에 삽입				
		if(head != null)
			head.llink = newNode;

		newNode.rlink = head;
		head = newNode;

		// (3) 원소 수 1 증가
		count++;
	}

	public int removeFirst(){
		if(head == null)
			System.out.println("삭제할 값이 없습니다. 프로그램을 다시 실행해 주세요.");

		Node temp = head;

		head = temp.rlink; 

		if(head != null)
			head.llink = null;

		count--;
		return temp.data;
	}

	public void remove(int data){
		Node temp = searchNode(data); 

		if(temp == null) 
			System.out.println(data + "이 존재하지 않습니다. ");
		else{
			if(temp.llink != null)
				temp.llink.rlink = temp.rlink;
			else
				head = temp.rlink;

			if(temp.rlink != null)
				temp.rlink.llink = temp.llink;

			count--;
			System.out.println("삭제 완료");
		}
	}

	// 리스트가 양방향연결이 제대로 이루어졌는지 확인
	public void printLink() {
		if (head == null) {
			System.out.println("공백리스트임");
		}
		else {
			// 리스트를 순방향으로 출력
			Node temp = head;
			System.out.print("리스트 길이=" + count + " 순방향 링크: ");
			while(temp.rlink != null) {
				System.out.print(temp.data + "->");
				temp = temp.rlink;
			}
			System.out.print(temp.data);

			// 리스트를 역방향으로 출력
			System.out.print(" 역방향 링크: ");
			while(temp.llink != null) {
				System.out.print(temp.data + "->");
				temp = temp.llink;
			}
			System.out.println(temp.data);
		}
	}

	// 리스트에서 item이 저장된 노드를 탐색하는 private 메소드 -- lab6_1에서는 사용하지 않음
	private Node searchNode(int data){
		Node temp = head; 

		while(temp != null){
			if(data == temp.data)
				return temp;			// 탐색 성공시 해당 노드 리턴
			else
				temp = temp.rlink;		
		}
		return temp;					// 탐색 실패시 null 리턴
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		Node temp = head;
		if(temp != null){
			while(temp.rlink != null){
				str.append(temp.data).append(", ");
				temp = temp.rlink;
			}
			str.append(temp.data);
		}
		return str.append("]\n").toString();
	}

	// 이중연결리스트 노드 구조
	private class Node {
		int data;
		Node llink; 
		Node rlink;

		Node() {
			this(0, null, null);
		}
		Node(int data) {
			this(data, null, null);
		}
		Node(int data, Node llink, Node rlink) {
			this.data = data;
			this.llink = llink;
			this.rlink = rlink;
		}
	}
}