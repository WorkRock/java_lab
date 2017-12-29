package lab5_4;

public class MainTriAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriAngle angle1 = new TriAngle();
		TriAngle angle2 = new TriAngle();
		System.out.println("lab5_4 : ÀÌÁöÈÆ\n");
		angle1.length = 2.5;
		angle1.height = 3.0;
		System.out.println("1¹ø »ï°¢ÇüÀÇ ³ĞÀÌ : " + angle1.calculArea());
		
		
		angle2.length = 5.0;
		angle2.height = 4.5;
		System.out.println("2¹ø »ï°¢ÇüÀÇ ³ĞÀÌ : " + angle2.calculArea());
	}

}
