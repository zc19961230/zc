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
		
		//ֻ����������һ����������
		System.out.println(b1 | b2);
		
		// ��Ҫ�������е�����
		System.out.println(b1 & b2);
		
		
		System.out.println(b1 || b2);
		System.out.println(b1 && b2);
		
		
		
	}
}
