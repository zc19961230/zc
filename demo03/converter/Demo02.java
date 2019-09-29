package org.soft.javabase.demo03.converter;

public class Demo02 {

	/**
	 * 大类型转小类型需要强制转换
	 * 小类型 标识符  = (小类型)大类型
	 * 注意： 内存溢出
	 * @param args
	 */
	public static void main(String[] args) {
		int int01 = 130;
		byte byte01 = (byte)int01;
		System.out.println(byte01);
	}
}
