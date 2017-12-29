package hw11_1;

public class Student {
	int code = 0;
	int age = 0;
	public Student(int code, int age){
		this.code = code;
		this.age = age;
	}
	public int getCode() {
		return code;
	}

	public int getAge() {
		return age;
	}
	public void print(){
		System.out.println("학번 : " + getCode() + ", 나이 : " + getAge());
	}	
}
