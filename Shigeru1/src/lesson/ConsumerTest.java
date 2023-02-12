package lesson;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> door = (name) -> System.out.println(name.startsWith("A"));
		
		door.accept("アリス");// aazz

	}

}
