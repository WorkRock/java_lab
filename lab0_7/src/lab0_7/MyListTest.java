//***************************
// ���ϸ�: MyListTest.java
// �ۼ���: 201632023 ������
// �ۼ���: 17. 09. 08.
// ����: Ŭ���� �ۼ�, ��ü ������ ����� �����Ѵ�.
//***************************

package lab0_7;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list = new MyList(); // MyList�� ��ü ����
		
		list.print(); // list�� ���
		
		list.add(2); //  list�� 2�� ����
		list.print(); // list�� ���
		
		list.add(3); // list�� 3�� ����
		list.print(); // list�� ���
		
		list.add(2); // list�� 2�� ����
		list.print(); // list�� ���
	}

}
