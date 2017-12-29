package lab6_2;

public class MainStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		System.out.println("lab6_2 : 이지훈");
		student1.setMath(40);
		student1.setEng(85);
		Student student2 = new Student(45,70);
		System.out.println("1번 학생 : " + student1.total() + "  2번 학생 : " + student2.total());
	}
}
