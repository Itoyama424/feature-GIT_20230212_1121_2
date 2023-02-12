package lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	final List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
			"Augast", "September", "October", "November", "December");
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("AAA", 1));
		persons.add(new Person("BBB", 2));
		persons.add(new Person("CCC", 3));
		persons.add(new Person("DDD", 4));
		persons.add(new Person("EEE", 5));
		
		List<Person> list = persons.stream().map(Person::getMe).collect(Collectors.toList());
		
		for (Person name : list) {
			System.out.println(name);
		}
		
		
	}


}

class Person {
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
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
	public Person getMe() {
		return this;
	}
}
class Person00011 {
	Person00011(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
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
	public Person00011 getMe() {
		return this;
	}
}
class Person000112 {
	Person000112(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
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
	public Person000112 getMe() {
		return this;
	}
}
class Person0001122 {
	Person0001122(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String name;
	int age;
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
	public Person0001122 getMe() {
		return this;
	}
}
class Person000xxxxxxxx {
	Person000xxxxxxxx(String name, int age) {
		this.name2 = name;
		this.age = age;
	}
	String name2;
	int age;
	public String getName() {
		return name2;
	}
	public void setName(String name) {
		this.name2 = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person000xxxxxxxx getMe() {
		return this;
	}
}