package lesson;

import java.util.function.BiFunction;
import java.util.function.Function;
public class FunctionTest {

	static Function<Integer, Integer> twice = new Function<Integer, Integer>() {
		
		@Override
		public Integer apply(Integer a) {
			return a*2;
		}
		
	};
	
	static BiFunction<Integer, Integer, String> biF = new BiFunction<Integer, Integer, String>() {
		@Override
		public String apply(Integer i1, Integer i2) {
			return "結果：" + (i1 + i2);
		}
	};
	
	public static void main(String[] args) {
		// --------------------------
		Integer intg = 3;
		
		System.out.println(twice.apply(intg));
		// --------------------------
		Function<Integer, String> twiceLambda = (i) -> ("Lambda String res is : " + (i * 2));
		
		System.out.println(twiceLambda.apply(intg));
		// --------------------------
		System.out.println(biF.apply(intg, 3));
		// --------------------------
		BiFunction<Integer, Integer, String> fbi = (i1, i2) -> ("BiFunction Lambda:" + (i1 + i2));
		
		System.out.println(fbi.apply(intg, 10));
	}

}
