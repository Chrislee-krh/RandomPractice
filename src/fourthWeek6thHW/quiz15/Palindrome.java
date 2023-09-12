package fourthWeek6thHW.quiz15;

public class Palindrome {
	
	static String palindromeCheck(String str) {
//		String str0 = new String();
//		StringBuilder str1 = new StringBuilder(str0);
//		
//		int index1 = 0;
//		int index2 = 0;
//		
//		str = str.replace(" ", "");
//		index1 = (int)(Math.floor(str.length()/2));
//		index2 = (int)(Math.ceil(str.length()/2))+1;
//		str0 = str.substring(index2, str.length());
//		str = str.substring(0, index1);
//		StringBuilder str2 = new StringBuilder(str).reverse();
//		
//		
//		return (str0.equals(str2.toString())) ? "회문입니다" : "회문이 아닙니다";
			
		StringBuilder s = new StringBuilder();
		s.append(str);
		while(true) {
		if(s.indexOf(" ") == -1) break;
		else s.deleteCharAt(s.indexOf(" "));
		}
	
		
		return s.toString().equals(s.reverse().toString()) ? "회문입니다" : "회문이 아닙니다";
	}
	
}
