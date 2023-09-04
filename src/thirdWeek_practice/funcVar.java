package thirdWeek_practice;


public class funcVar {
	
	public static void main(String[] args) {
		
	int x = 50;
	
	Data d = new Data();
	
	System.out.println(x);
	System.out.println(d.x);	
	d.change();
	System.out.println(x);
	System.out.println(d.x);

	}
}
