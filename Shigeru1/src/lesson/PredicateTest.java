package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	public static void main(String args[]) {
		
		List<Person2> persons = new ArrayList<>();
		persons.add(new Person2("AAA", 1));
		persons.add(new Person2("BBB", 2));
		persons.add(new Person2("CCC", 3));
		persons.add(new Person2("DDD", 4));
		persons.add(new Person2("EEE", 5));
		
		Predicate<Person2> p1 = a -> a.getAge() >= 3;
		Predicate<Person2> p2 = ag -> ag.getAge() <= 1;
		
		List<Person2> list = persons.stream().filter(p1.or(p2)).map(e -> e.getMe()).collect(Collectors.toList());
		
		for (Person2 p : list) {
			System.out.println(p.getName() + ":" + p.getAge());
		}
		
		persons.stream().filter(p1.or(p2)).map(Person2::getMe)
		.collect(Collectors.toList()).stream().forEach(pp -> System.out.println(pp.getName() + "|" + pp.getAge()));
	}

}
class Person2 {
	Person2(String name, int age) {
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
	public Person2 getMe() {
		return this;
	}
}
