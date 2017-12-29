package lab6_3;

public class Member {
	private String name;
	private int number;
	private static int memberAmount = 0;
	
	public Member(String m)
	{
		this.name = m;
		this.number = ++memberAmount;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public int getNumber()
	{
		return number;
	}
	public static int getMemberAmount()
	{
		return memberAmount;
	}
}
