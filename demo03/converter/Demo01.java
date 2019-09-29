package org.soft.javabase.demo03.converter;

public class Demo01 {

	/**
	 *      小类型转大类型,
	 *      小类型直接赋值给大类型即可
	 * @param args
	 */
	public static void main(String[] args) {
		byte byte01 = 100;
		int int01 = byte01;
		System.out.println(int01);
		
		float float01 = 3.1415926F;
		double double01 = float01;
		System.out.println(float01);
		
	}
}
