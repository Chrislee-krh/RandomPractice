package thirdWeek4thHW.quiz7_1;

public class ArrayPrint {
	
	void printArray(String[] str){
		for(String s : str) System.out.print(s+"\t");
		System.out.println();
	}
	
	void printArray(int[] i) {
		for(int num : i) System.out.print(num+"\t");
		System.out.println();
	}
	
	void printArray(char[] c) {
		for(char ch : c) System.out.print(ch+"\t");
		System.out.println();
	}
}
