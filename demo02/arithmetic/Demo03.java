package org.soft.javabase.demo02.arithmetic;

public class Demo03 {

	/**
	 *   !  |  &  ||  &&
	 * @param args
	 */
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2  = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println(!b1);
		
		//只需满足其中一个条件即可
		System.out.println(b1 | b2);
		
		// 需要满足所有的条件
		System.out.println(b1 & b2);
		
		
		System.out.println(b1 || b2);
		System.out.println(b1 && b2);
		
		
		
	}
}
