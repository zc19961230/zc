package org.soft.javabase.demo02.arithmetic;

public class Demo02 {

	/**
	 * <  <=  >  >=  !=  ==
	 * @param args
	 */
	public static void main(String[] args) {
		int i =  10;
		int j = 5;
		boolean b = i > j;
		System.out.println(b);
		b = (i < j);
		System.out.println(b);
		
		int a = 5;
		b =  (i >= j);
		System.out.println(b);
		
		b =  (a <= j);
		System.out.println(b);
		
		b = (a != j) ;
		System.out.println(b);
		
		b = (a == j);
		System.out.println(b);
		
	}
}
