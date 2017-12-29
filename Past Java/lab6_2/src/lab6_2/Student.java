package lab6_2;

public class Student {
	private int mathScore;
	private int engScore;

	public Student(){
	}
	public Student(int math, int eng) {
		mathScore = math;
		engScore = eng;
	}
	public int total()
	{
		int total = 0;
		total = mathScore + engScore;
		return total;
	}
	public int getMath()
	{
		return mathScore;
	}
	public void setMath(int mathScore)
	{
		this.mathScore = mathScore;
	}
	public int getEng()
	{
		return engScore;
	}
	public void setEng(int engScore)
	{
		this.engScore = engScore;
	}
}
