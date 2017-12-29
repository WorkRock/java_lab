package hw7_1;

import java.util.Scanner;
import java.util.Stack;


public class CheckBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_1 : ������");
		Stack<Character> stack = new Stack<Character>();
		Scanner input = new Scanner(System.in);

		System.out.print("�˻��� ��ȣ �Է� : ");
		String a = input.nextLine();

		for(int i = 0; i<a.length(); i++){
			char c = a.charAt(i);
			if(c == '(' || c == '{' || c == '[' || c == '<'){
				stack.push(c);
			}
			else if(c == ')' || c == '}' || c == ']' || c == '>'){
				if(c == ')'){
					char x = stack.peek();
					if(x != '(')
						break;
				}
				else if(c == '}'){
					char x = stack.peek();
					if(x != '{')
						break;
				}
				else if(c == ']'){
					char x = stack.peek();
					if(x != '[')
						break;
				}				
				else if(c == '>'){
					char x = stack.peek();
					if(x != '<')
						break;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty() == true){
			System.out.println("�ùٸ� ��ȣ�� �Դϴ�.");
		}
		else
			System.out.println("�ùٸ��� ���� ��ȣ�� �Դϴ�.");
	}

}
