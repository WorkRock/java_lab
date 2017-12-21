package e2017.exam3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String name;
	Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
	@Override 
	public String toString() {
		return "Person(\"" + name + "\", " + age + ")";
	} 

}

class DescendingName implements Comparator<Person> { // 이름 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		return (o2.getName()).compareTo(o1.getName());
	}
}

class AscendingName implements Comparator<Person> { // 이름 오름차순
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class DescendingAge implements Comparator<Person> { // 나이 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		return o2.getAge().compareTo(o1.getAge());
	}
}

class AscendingAge implements Comparator<Person> { // 나이 오름차순
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge().compareTo(o2.getAge());
	}
}

/*
sort1 메소드 = list 배열을 이름 오름차순으로 정렬한다.
sort2 메소드 = list 배열을 이름 내림차순으로 정렬한다.
sort3 메소드 = list 배열을 나이 오름차순으로 정렬한다.
sort2 메소드 = list 배열을 나이 내림차순으로 정렬한다.
 */
public class Example3 {

	static void sort1(List<Person> list) {
		AscendingAge asc = new AscendingAge();
		Collections.sort(list,asc);
	}

	static void sort2(List<Person> list) {
		DescendingAge dsc = new DescendingAge();
		Collections.sort(list,dsc);
	}

	static void sort3(List<Person> list) {
		AscendingAge asc = new AscendingAge();
		Collections.sort(list,asc);
	}

	static void sort4(List<Person> list) {
		DescendingAge dsc = new DescendingAge();
		Collections.sort(list,dsc);
	}
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 18));
		list.add(new Person("임꺽정", 19));
		list.add(new Person("전우치", 20));
		sort1(list);
		System.out.println(list.toString());
		sort2(list);
		System.out.println(list.toString());
		sort3(list);
		System.out.println(list.toString());
		sort4(list);
		System.out.println(list.toString());
	}

}
