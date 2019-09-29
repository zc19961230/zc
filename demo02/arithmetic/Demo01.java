package org.soft.javabase.demo02.arithmetic;

public class Demo01 {

	/**
	 * + - * / %  ++ --
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0 ; 
		int j = 1 ;
		int sum = i + j;
		System.out.println(sum);
		
		sum = sum - j ;
		System.out.println(sum);
		
		int k = 2;
		int value = k * j;
		System.out.println(value);
		
		int q = 10 ;
		int g = 3;
		int h = q / g;
		System.out.println(h);
		
		double d1 = 10;
		double d2 = 3;
		double d3 = d1 / d2;
		System.out.println(d3);
		
		h = q % g;
		System.out.println(h);
		System.out.println("------------------------------");
		int a = 1;
		a++;
		a++;
		System.out.println(a++);
		System.out.println(a);
		
		a--;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(--a);
		
		
		
	}
}
