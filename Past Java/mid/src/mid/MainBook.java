package mid;

public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mid : ¿Ã¡ˆ»∆\n");
		Book book1 = new Book("java1",5000);
		Book book2 = new Book("java2",20000);
		
		book1.salePrice();
		book2.salePrice();
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice()+"\n");
		System.out.println(book2.getTitle());
		System.out.println(book2.getPrice());
	}

}
