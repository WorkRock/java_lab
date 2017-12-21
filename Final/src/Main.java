/*
 * 파일명: Final.java
 * 작성일: 2017.12.21
 * 작성자: 홍길동
 * 내용: 이진 검색을 이용하여 정수값을 검색하는 프로그램
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("final: 홍길동");
		Scanner scan = new Scanner(System.in);

		// 사용자가 원하는 갯수의 int형 원소를 입력받아 배열 array에 저장
		System.out.print("\n정수 갯수 입력: ");
		int n = scan.nextInt();
		int[] array = new int[n];

		System.out.println(n + "개의 정수 입력: ");
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		// 배열 array의 원소를 오름차순으로 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// 검색할 키값을 입력받음
		System.out.print("\n검색할 키값 입력:");
		int key = scan.nextInt();

		// 순차 검색 방법을 이용하여 배엘에서 키값을 검색
		System.out.print("(1)순차 검색 결과: ");
		int index1 = sequentialSearch(array, key);
		if(index1 == -1)
			System.out.println("검색 실패");
		else 
			System.out.println("검색 성공 : 인덱스 = " + index1);

		// 이진 검색 방법을 이용하여 배엘에서 키값을 검색
		System.out.print("(2)이진 검색 결과: ");
		int index2 = binarySearch(array, key);
		if(index2 == -1)
			System.out.println("검색 실패");
		else 
			System.out.println("검색 성공 : 인덱스 = " + index2);

		// 문제(3):  순차 검색, 이진 검색 결과가 다르게 나오는 경우가 있는지, 있다면 어떤 경우인지 출력하세요.
		System.out.println("같은값이 두개 이상일");
	}

	// 문제(1): 순차 검색 메소드 - array 전체에서 key를 검색하여 인덱스를 리턴; 검색 실패시 -1 리턴 
	private static int sequentialSearch(int[] array, int key) {
		for(int i = 0; i<array.length; ++i) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;	// 검색 실패
	}

	// 문제(2): iterative algorithm을 이용한 이진 검색 메소드 - array 전체에서 key를 검색하여 인덱스를 리턴; 검색 실패시 -1 리턴 
	private static int binarySearch(int[] array, int key) {
		int lb = 0;
		int ub = array.length-1;
		while(lb <= ub) {
			int middle = (lb+ub)/2;
			if(array[middle] == key) {
				return middle;
			}
			else if(key > array[middle]) {
				lb++;
			}
			else
				ub--;
		}
		return -1;
	}
}

