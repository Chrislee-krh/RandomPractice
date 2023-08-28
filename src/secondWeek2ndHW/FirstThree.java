package secondWeek2ndHW;

import java.util.Arrays;
import java.util.Scanner;

public class FirstThree {

	public static void main(String[] args) {
		//1-1
		int sum = 0;
		for (int i = 1; i<=100; i++ ) {
			sum += (i%3 ==0) ? i : 0;
		//1-2
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//2-1
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("양수를 입력하시오> ");
		int c = scan.nextInt();
		
		if (c<=0) {
			System.out.println("양수를 입력하세요!");
			return;
		}
		
		int[] intArray = new int[c];
			
		for (int i =0; i<c; i++ ) {
			intArray[i] = i+1;
		}
		
		System.out.println(Arrays.toString(intArray));
		
		//3-1
		
		System.out.print("몇 단의 구구단을 원하시나요?> ");
		int dan = scan.nextInt();
		
		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("-----");
		for (int i = 2; i<9; i++) {
			for (int j = 1; j<9; j++) {
				
				if(i == dan)	System.out.println(i + "*" + j + "=" + j*i);
			}
		}
		
	}
}

		