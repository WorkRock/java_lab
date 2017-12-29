package lab5_5;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentScores scores = new StudentScores();
		
		scores.mathScore = 40;
		scores.engScore = 85;
		System.out.println("lab5_5 : 이지훈\n");
		System.out.println("학생의 평균 성적 : " + scores.averScore());
		System.out.print("1번 조건 : ");
		if(scores.judgePass(40, 60) == true)
			System.out.println("pass");
		else
			System.out.println("nonpass");
		System.out.print("2번 조건 : ");
		if(scores.judgePass(50, 50) == true)
			System.out.println("pass");
		else
			System.out.println("nonpass");
		/* boolean대신 int를 사용했을때
		if(scores.judgePass(40, 60) == 1)
			System.out.println("pass");
		else
			System.out.println("nonpass");
		judge = scores.judgePass(50, 50);
		if(scores.judgePass(50, 50) == 1)
			System.out.println("pass");
		else
			System.out.println("nonpass");
		*/
	}

}
