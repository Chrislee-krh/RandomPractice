package secondWeek;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		int[] num = new int[1000];
		
		for(int i = 0; i<1000; i++) {
			num[i] = (int)(Math.random()*100+1);
		}
		int cnt = 0;
		for(int j=1; j<=100;j++) {
			for(int i=0; i<num.length;i++) {
				if(j==num[i]) {
//					cnt[j-1]++;
				}
			}
		}

	}

}
