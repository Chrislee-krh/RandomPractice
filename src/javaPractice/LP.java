package javaPractice;

//import java.util.function.BiConsumer;
//import java.util.function.Consumer;
//import java.util.function.DoubleBinaryOperator;
//import java.util.function.DoubleConsumer;
//import java.util.function.Function;
//import java.util.function.IntBinaryOperator;
//import java.util.function.IntSupplier;
//import java.util.function.ObjDoubleConsumer;
//import java.util.function.ObjIntConsumer;
//import java.util.function.Supplier;
//import java.util.function.ToDoubleFunction;
//import java.util.function.ToIntFunction;
//
//import sun.awt.geom.AreaOp.IntOp;
import java.util.function.Predicate;

public class LP {
	
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("금동이", 100, 100, "심리학"),
			new Student("이장춘", 100, 100, "컴공")
	};
	
	public static void main(String[] args) {
		
		double avg = avgMathCS(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공자들의 평균 수학 점수: " + avg);
		
		double avg2 = avgScCS(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공자들의 평균 과학 점수: " + avg2);
		
	}
	public static double avgScCS(Predicate<Student> ps) {
		int sum = 0;
		int cnt = 0;
		for(Student s : list) {
			if(ps.test(s)) {
			sum += s.getScience();
			cnt++;
			}
		}
		return sum/(double)cnt;
		
	}
	
	public static double avgMathCS(Predicate<Student> ps) {
		int sum = 0;
		int cnt = 0;
		
		for(Student s : list) {
			if(ps.test(s)) {
				sum += s.getMath();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
	
	
		/* Operator
		System.out.print("최대 수학 점수: ");
		int max = maxOrMinMath((a,b) -> (a>=b ? a : b));
		
		System.out.println("최소 수학 점수: ");
		int min = maxOrMinMath((a,b) -> (a<=b? a: b));
	
		System.out.println("최대 평균 점수: ");
		System.out.println(maxAvgMath((a,b) -> (a>=b ? a:b)));
		
		System.out.println("최소 평균 점수: ");
		System.out.println(maxAvgMath((a,b) -> (a<=b ? a:b)));
		
	}
	
	public static double maxAvgMath(DoubleBinaryOperator io) {
		int sum = 0;
		double result = (list[0].getMath() + list[0].getScience())/2.0;
		for(Student s : list) {
			result = io.applyAsDouble(result, (s.getMath()+s.getScience())/2.0);
		}
		return result;
	}
	
	
	public static int maxOrMinMath(IntBinaryOperator io) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = io.applyAsInt(result, s.getMath());
		}
		System.out.println(result);
		return result;
	}
		/* function
		System.out.print("학생명: ");
		printString(t -> t.getName());
		
		System.out.print("전공: ");
		printString(t -> t.getMajor());
		
		System.out.println("수학점수: ");
		printInt(t -> t.getMath());
		
		System.out.println("과학점수: ");
		printInt(t -> t.getScience());
		
		System.out.println("수학 점수 합계: ");
		printSum(t -> t.getMath());
		
		System.out.println("수학 점수 평균: ");
		printAvg(t -> t.getMath());
	}
	
	public static void printAvg(ToDoubleFunction<Student> f) {
		int sum = 0;
		int cnt = 0;
		
		for(Student s : list) {
			sum += f.applyAsDouble(s);
			cnt++;
		}
		System.out.println(sum/(double)cnt);
	}
	
	public static void printSum(ToIntFunction<Student> f) {
		int sum = 0;
		
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
	}
	
	public static void printInt(ToIntFunction<Student> f) {
		for(Student s: list) {
			System.out.println(f.applyAsInt(s));
		}
	}
	
	public static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.println(f.apply(s));
		}
		System.out.println();
	}
	*/
}
	
class Student{
	String name;
	int math;
	int science;
	String major;

	public Student() {}

	public Student(String name, int math, int science, String major) {
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
