package org.soft.javabase.demo03.converter;

public class Demo03 {

	/**
	 * 字符串转换成数据类型
	 * @param args
	 */
	public static void main(String[] args) {
		String value = "123";
		int intValue = Integer.parseInt(value);
		System.out.println(intValue);
		
		double doubleValue = Double.parseDouble(value);
		System.out.println(doubleValue);
		
		float floatValue = Float.parseFloat(value);
		System.out.println(floatValue);
	}
}
