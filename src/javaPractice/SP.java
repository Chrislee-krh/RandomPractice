package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SP {
	static int num = 1;
	public static void main(String[] args) {
	
		String[] strArr = new String[] {"홍길동", "김유신", "이순신","유관순"};
		
		Stream<String> stream = Arrays.stream(strArr);
		System.out.println(stream);
		stream.forEach(System.out::println);
		
		List<String> list = Arrays.asList(strArr);
		System.out.println(list);
		list.stream().forEach(s -> System.out.println(s));
		
		IntStream.range(3, 6).forEach(System.out::println);
		
		List<String> list2 = Arrays.asList("s", "d");
		Stream<String> stream2 = list2.stream();
		stream2.forEach(s -> System.out.println(s));
		
		Stream stream3 = Stream.builder()
				.add("콩나물")
				.add("콩나무")
				.build();
		
		stream3.forEach(System.out::println);
		
		
		Stream<String> stream4 = Stream.generate(() -> 
			"애국가" + (SP.num++)
			).limit(10);
		stream4.forEach(System.out::println);
		
		Stream<Integer> stream5 = Stream.iterate(1, n -> n+1).limit(10); 
		
	}

}
