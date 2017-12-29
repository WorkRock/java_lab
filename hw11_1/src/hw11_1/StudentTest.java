package hw11_1;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("hw11_1 : 이지훈");
		
		System.out.print("입력할 학생 수 입력 : ");
		int n = input.nextInt();
		
		Student[] stu = new Student[n];
		
		for(int i = 0; i < n; i++){
			System.out.print("학번 입력 : ");
			int c= input.nextInt();
			System.out.print("나이 입력 : ");
			int a = input.nextInt();
			stu[i] = new Student(c,a);
		}
		
		for(int i = 0; i < n; i++){
			stu[i].print();
		}
		System.out.println();
		
		System.out.println("학생들을 나이순으로 배치합니다.");
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