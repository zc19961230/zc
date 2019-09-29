package org.soft.javabase.demo01.basic;

public class BasicType {
	// byte
	public static void main(String[] args) {
		//-128 至 127
		// 字节类型
		byte byte01 = 125;
		System.out.println(byte01);
		
		//短整型
		short short01 = 30000;
		System.out.println(short01);
		
		//单字节单字符类型
		char char01 = 'A';
		System.out.println(char01);
		
		//整型
		int int01 = 2100000000;
		System.out.println(int01);
		
		//长整型
		long long01 = 10000000000000000L;
		System.out.println(long01);
		
		//保留8位数字
		//当数据过大是会采用科学计数法
		float float01 = 123456789.123456759F;
		System.out.println(float01);
		
		//保留17位数字
		//当数据过大是会采用科学计数法
		double double01 = 123.123456789123456789;
		System.out.println(double01);
		
		//true  false
		boolean boolean01 = true;
		
		//引用类型 
		// 字符串类型
		String value = "I LIKE CHINRESE FOODS .";
		System.out.println(value);
		

	}
}
