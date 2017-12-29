package lab5_3;

public class StoreMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount storeMoney = new BankAccount();
		storeMoney.deposit(2000);
		storeMoney.deposit(3000);
		System.out.println("lab5_3 : ÀÌÁöÈÆ");
		System.out.println("³²Àº ÀÜ¾× : " + storeMoney.balance);
	}

}
