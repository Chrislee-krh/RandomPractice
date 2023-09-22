package javaPractice;

import java.awt.Shape;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SP {
	static int num = 1;
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("독도는", "우리 땅");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(s -> System.out.println(s));

		
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3","4.4,5.5,6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {
			String[] sArray = data.split(",");
			Double[] dArray = new double[str.length];
			for(int i = 0; i<dArray.length; i++) {
				dArray[i] = Double.parseDouble(str[i].trim());
			}
			return Arrays.stream(dArray);
		});
		dsr.forEach(n->System.out.println(n));
		
		List<String> list = Arrays.asList("홍","홍1");
		list.stream().distinct().sorted().filter(n-> n.startsWith("홍")).forEach(s -> System.out.println(s));
		
		String str = "자바 세상을 만들자";
		
		IntStream isr = str.chars();
		isr.forEach(s -> System.out.println((char)s));
		
		Stream<String> str1 = Stream.of("홍","황");
		Stream<Integer> str2 = Stream.of(1,2,3,4,5);
		
		Stream<Object> concat1 = Stream.concat(str1, str2);
		
		concat1.forEach(a -> System.out.println(a));
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		list.stream().forEach(s -> {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		long end = System.nanoTime();
		System.out.println(end - start);
		
		start = System.nanoTime();
		list.stream().forEach(s -> {
			
			try {
				Thread.sleep(50);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		});
		end = System.nanoTime();
		System.out.println(end - start);
		
		
		
		
		
		Shape s1 = new Rectangle(10,3);
		Shape s2 = new Circle(4);
		
		List<Shape> list = Arrays.asList(s1,s2);
		
		Map<Object, List<Shape>> map = list.stream().collect(Collectors.groupingBy(f -> f.getClass()));
		map.get(Class.forName("sth")).stream().forEach(s -> System.out.println(s));
		
		list.stream().sorted().forEach(s -> System.out.println(s));
		
		list.stream().sorted((a,b) -> b.compareTo(a) - a.compareTo(b)).forEach(s -> System.out.println(s));
		list.stream().sorted(Comparator::reverseOrder()).forEach(System.out::println);
		list.stream().sorted(new Comparator<Shape>() {
			@Override
			public int compare(Shape o1, Shape o2) {
				return (int)(o1.area()- o1.area());
			}
		}).forEach(System.out::println);
		
		list.stream().sorted((a,b) -> a.length()-b.length()).forEach(System.out::println);
		try {
			Path path = Paths.get("src");
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(s -> System.out.println(s.getFileName()));
			
			Stream<Path> sr2 = Files.find(path, 5, (p, BasicFileAttributes)->{
				File file = p.toFile();
				return !file.isDirectory() && file.getName().contains("Stream");
			});
			sr2.forEach(s -> System.out.println(s.getFileName()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			Path path = Paths.get("src/day20/strstream/strToStream.java");
			Stream<String> sr =
					Files.lines(path, Charset.forName("utf-8"));
			
			sr.forEach(s -> System.out.println(s));
			sr.close();
			System.out.println();
			
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);//버퍼리더로 읽으면 스트림으로 들어간다.
			br.lines().forEach(s -> System.out.println(s));;
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
