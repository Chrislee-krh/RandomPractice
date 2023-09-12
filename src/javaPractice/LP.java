package javaPractice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public class LP {
	
	static Student[] list = {
			new Student{"홍길동", 90, 80, "컴공"},
			new Student{"금동이", 100, 100, "심리학"},
			new Student{"이장춘", 100, 100, "컴공"}
	};
	
	public static void main(String[] args) {
	Function<T, R>
	}
}

class Student{
	String name;
	int math;
	int science;
	String major;

	public Student() {}

	public Student(String name, int math, int science, String major) {
		super();
		this.name = name;
		this.math = math;
		this.science = science;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", science=" + science + ", major=" + major + "]";
	}
	
	
	
	
}

//public static void main(String[] args) {
//	Supplier<String> s1 = () -> {
//		return "이순신";
//	};
//	System.out.println(s1.get());
//	
//	s1 = () -> "김종국";
//	System.out.println(s1.get());
//	
//	IntSupplier s2 = () -> {
//		return (int)(Math.random()*6)+1;
//	};
//	System.out.println(s2.getAsInt());
//	
//	DoubleSupplier s3 = () -> {
//		return (double)Math.PI;
//	};
//	System.out.println(s3.getAsDouble());
//}

//public static void main(String[] args) {
//	Consumer<String> c1 = (String name) -> {
//		System.out.println("제 이름은 " + name + "입니다.");
//	};
//	c1.accept("강남스타일");
//	
//	BiConsumer<String, String> c2 = (String name, String desc) -> {
//		System.out.println("네 이름 " + name + "(은)는 뜻이 " + desc + "이지.");
//	};
//	c2.accept("우성", "뜬 구름잡는 인생");
//	
//	DoubleConsumer c3 = (double num) -> {
//		 System.out.println("사랑도 " + num);
//	};
//	c3.accept(99.9);
//	
//	ObjDoubleConsumer<String> info = (lecture, price) -> System.out.println("지금 듣고 있는 " + lecture + "수업은 " + price + "달러을 지불했다");
//	info.accept("컴공", 96.5);
//}

//public static void main(String[] args) {
//	
//	Outer o = new Outer();
//	o.method();
//	
//}
//}
//
//interface Lambda{
//void method();
//}
//
//class Outer{
//public int iv = 10;
//void method() {
//	final int iv = 40;
//	Lambda ls = () -> {
//		System.out.println(Outer.this.iv);
//		System.out.println(this.iv);
//		System.out.println(iv);
//	};
//	ls.method();
//}
//}	
	
//public static void main(String[] args) {
//	PrintScreen ps = (String name) -> {
//		System.out.println(name);
//	};
//	ps.print("가나초콜릿");
//}
//}
//
//interface PrintScreen{
//void print(String name);
//}
	
//public static void main(String[] args) {
//	
//	System.out.println("시작");
//	Runnable run = () -> {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("첫번째: " + i);
//		}
//	};
//	
//	Runnable run2 = () -> {
//		for(int i = 0;i < 10; i++) {
//			System.out.println("두번째: " + i);
//		}
//	};
//	
//	Thread t1 = new Thread(run);
//	Thread t2 = new Thread(run2);
//	
//	t1.start();
//	t2.start();
//	System.out.println("끄읏");
//	
//}
	
//public static void main(String[] args) {
//		PrintScreen p = () -> print();
//		p.print();
//	}
//		
//		static void print() {
//			System.out.println("출력합니다");
//		}
//	}
//	
//	interface PrintScreen{
//		void print();
//	}
//	
	
//	public static void main(String[] args) {
//		InterfaceEx ie = (x,y) -> x+y;
//		System.out.println(ie.sum(1,2));
//	}
//	
//}
//
//interface InterfaceEx{
//	public int sum(int x, int y);
//}
