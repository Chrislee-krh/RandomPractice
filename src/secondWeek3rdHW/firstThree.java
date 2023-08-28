package secondWeek3rdHW;

import java.util.Arrays;
import java.util.Scanner;

public class firstThree {

	public static void main(String[] args) {
		//16-3
		Scanner scan = new Scanner(System.in);
		String[] str = new String[100];
		int cnt = 0;
		
		outer : while(true) {
			for(int i = 0; i<=cnt; i++) {
				for(int j = 0; j<=cnt; j++) {
				System.out.print("입력할 카카오친구> ");
				str[i] = scan.nextLine();
					if(str[i].equals(str[j])) {
						System.out.println("이미 입력된 친구입니다.");
						System.out.println("---------------");
					} else {
						cnt++;
						System.out.println(str[i]+"입력 성공!");
						System.out.println("---------------");
					}
					if(str[i].equals("그만")) {
						break;
					}
				}
				
			}
			if (cnt >= 100) {
                System.out.println("더 이상 입력할 수 없습니다.");
                break;
			}
		}
		System.out.println(cnt + "명의 카카오 친구가 입력 되었습니다.");
		
		
		//16-2
//		Scanner scan = new Scanner(System.in);
//		String[] str = new String[100];
//		int cnt = 0;
//		
//		outer : while(true) {
//			for(int i = 0; i<=100; i++) {
//				System.out.print("입력할 카카오친구> ");
//				str[i] = scan.nextLine();
//				if(str[i].equals("그만")) {
//					break outer;
//				}
//				
//				System.out.println(str[i]+"입력 성공!");
//				System.out.println("---------------");
//				cnt++;
//				if (cnt >=100){
//					System.out.println("더 이상 입력할 수 없습니다.");
//				}
//			}
//		}
//		
//		System.out.println(cnt + "명의 카카오 친구가 입력 되었습니다.");
//		
		
		
		//16-1
//		Scanner scan = new Scanner(System.in);
//				
//		String[] str = new String[100];
//		int cnt = 0;
//		
//		System.out.println("# 먹고 싶은 음식을 입력하세요!!");
//		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
//		outer : while(true) {
//			for(int i = 0; i<100; i++ ) {
//				System.out.print("> ");
//				str[i] = scan.next();
//				if(str[i].equals("그만")) {
//					System.out.println("입력 종료!!");
//					break outer;
//				}
//					cnt++;
//					if (cnt >=100){
//						System.out.println("더 이상 입력할 수 없습니다.");
//						break;
//					}
//			}
//			
//		}
//		System.out.print("내가 먹고 싶은 음식들: [ ");
//		for(int i = 0; i<cnt; i++ )
//			System.out.print(str[i] + " ");
//		System.out.print("]");
	}

}
