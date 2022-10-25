package java018_collection;

import java.util.Comparator;

public class Person implements Comparator<Person>{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d",name, age);
	}
	
	//이름 오름차순, 나이 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getName().equals(o2.getName())) {
			return new Integer(o2.getAge()).compareTo(new Integer(o1.getAge()));
		}else {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	
}
