//***************************
// 파일명: MyListTest.java
// 작성자: 201632023 이지훈
// 작성일: 17. 09. 08.
// 설명: 클래스 작성, 객체 생성과 사용을 연습한다.
//***************************

package lab0_7;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList(); // MyList형 객체 생성
		
		list.print(); // list를 출력
		
		list.add(2); //  list에 2를 저장
		list.print(); // list를 출력
		
		list.add(3); // list에 3를 저장
		list.print(); // list를 출력
		
		list.add(2); // list에 2를 저장
		list.print(); // list를 출력
	}

}
