package mid;
/*
 * 파일명: MyList.java
 * 작성자: 홍길동
 * 작성일: 2017년 10월 19일
 * 내용: 이중연결자료구조로 선형리스트를 구현한 MyList 클래스
 */

public class MyList {

	private Node head;	// 리스트의 첫번째 노드를 가리킬 변수
	private int count;	// 리스트의 길이(원소 수)를 나타내는 변수

	public MyList() {
		head = null;
		count = 0;
	}

	// 리스트 길이를 리턴
	public int size() {
		return count;
	}


	// 문제: addLast() 메소드를 정의하세요. 
	// addLast()는 item을 매개변수로 받아 리스트의 맨 뒤에 item을 삽입하고 리스트 길이를 증가시킴
	public void addLast(int item) {
		Node newNode = new Node(item);
		Node temp = head;
		
		if(count==0){
			head = newNode;
		}
		
		else{
			while(temp.rlink != null)
				temp = temp.rlink;
			temp.rlink = newNode;
			newNode.llink = temp;
		}
		
		count++;
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


