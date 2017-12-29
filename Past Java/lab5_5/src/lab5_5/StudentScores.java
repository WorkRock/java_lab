package lab5_5;

public class StudentScores {
	double mathScore;
	double engScore;
	
	double averScore()
	{
		double average = 0;
		average = mathScore + engScore;
		return average/2;
	}
	
	boolean judgePass(int passMath, int passEng)
	{
		boolean pass = false;
		if(mathScore>=passMath)
			if(engScore>=passEng)
			pass = true;
		return pass;
	}
	/* true/false문을 쓰시라고 해서 본문은 boolean 이지만 원래 짯던 코드
	int judgePass(int passMath, int passEng)
	{
		int pass = 0;
		if(mathScore>=passMath)
			if(engScore>=passEng)
			pass = 1;
		return pass;
	} */
	
}
