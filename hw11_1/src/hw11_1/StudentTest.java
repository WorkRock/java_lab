package hw11_1;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("hw11_1 : ������");
		
		System.out.print("�Է��� �л� �� �Է� : ");
		int n = input.nextInt();
		
		Student[] stu = new Student[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("�й� �Է� : ");
			int c= input.nextInt();
			System.out.print("���� �Է� : ");
			int a = input.nextInt();
			stu[i] = new Student(c,a);
		}
		
		for(int i = 0; i < n; i++){
			stu[i].print();
		}
		System.out.println();
		
		System.out.println("�л����� ���̼����� ��ġ�մϴ�.");
		insertionSort(stu);
		
		for(int i = 0; i < n; i++){
			stu[i].print();
		}
	}
	
	public static void insertionSort(Student[] a){
		Student item;
		int j;
		for(int i = 1; i < a.length; i++){
			item = a[i];
			for(j = i; (j>0)&&(a[j-1].age>item.age); j--){
				a[j] = a[j-1];
			}
			a[j] = item;
		}
	}
}