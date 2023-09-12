package javaPractice;

import java.util.ArrayList;

public class jib {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4};
		int[] array2 = {3,4,5,6};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList kyo = new ArrayList();
		ArrayList cha = new ArrayList();
		ArrayList hap = new ArrayList();
		
		for(int i : array1) {list.add(i);}
		for(int j : array2) {list2.add(j);}
		for(int k : list) {hap.add(k);}
		
		for(int l : list2) {
			if(!hap.contains(l)) hap.add(l);
			else kyo.add(l);
		} 
		System.out.println("합집합: " + hap.toString());
		System.out.println("교집합: " + kyo.toString());
		
		hap.removeAll(list);
		System.out.print("차집합: " + hap.toString() + ", " );
		for(int k : list) {
			hap.add(k);
		}
		hap.removeAll(list2);
		System.out.println(hap.toString());
	}
}
