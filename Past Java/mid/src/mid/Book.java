package mid;

public class Book {
	private String title;
	private int price;
	
	public Book(String b, int money)
	{
		title = b;
		price = money;
	}
	public String getTitle()
	{
		return title;
	}
	public int getPrice()
	{
		return price;
	}
	public void salePrice()
	{
		if(price <= 10000)
			price = price*9/10;
		else
			price = price - 1000;
	}
}
