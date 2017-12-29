package lab6_1;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student score = new Student();
		System.out.println("lab6_1 : 이지훈");
		score.setMath(40);
		score.setEng(85);
		System.out.println("수학의 점수 : " + score.getMath() + " 영어의 점수 : " + score.getEng());
	}

}
