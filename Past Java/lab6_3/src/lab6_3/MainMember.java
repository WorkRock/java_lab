package lab6_3;

public class MainMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_3 : ������");
		System.out.println("���� ȸ�� ���� " + Member.getMemberAmount() + "�� �Դϴ�.");
		Member m1 = new Member("Lee");
		Member m2 = new Member("Ji");
		Member m3 = new Member("Hun");
		
		m1.setName("Lee");
		m2.setName("Ji");
		m3.setName("Hun");
		System.out.println(m1.getName() + "���� ȸ�� ��ȣ�� " + m1.getNumber() + "�� �Դϴ�.");
		System.out.println(m2.getName() + "���� ȸ�� ��ȣ�� " + m2.getNumber() + "�� �Դϴ�.");
		System.out.println(m3.getName() + "���� ȸ�� ��ȣ�� " + m3.getNumber() + "�� �Դϴ�.");
		System.out.println("���� ȸ������ " + Member.getMemberAmount() + "�� �Դϴ�.");
	}

}
