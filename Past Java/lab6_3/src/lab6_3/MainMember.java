package lab6_3;

public class MainMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_3 : 이지훈");
		System.out.println("현재 회원 수는 " + Member.getMemberAmount() + "명 입니다.");
		Member m1 = new Member("Lee");
		Member m2 = new Member("Ji");
		Member m3 = new Member("Hun");
		
		m1.setName("Lee");
		m2.setName("Ji");
		m3.setName("Hun");
		System.out.println(m1.getName() + "님의 회원 번호는 " + m1.getNumber() + "번 입니다.");
		System.out.println(m2.getName() + "님의 회원 번호는 " + m2.getNumber() + "번 입니다.");
		System.out.println(m3.getName() + "님의 회원 번호는 " + m3.getNumber() + "번 입니다.");
		System.out.println("현재 회원수는 " + Member.getMemberAmount() + "명 입니다.");
	}

}
