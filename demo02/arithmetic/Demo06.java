package org.soft.javabase.demo02.arithmetic;

public class Demo06 {

	public static void main(String[] args) {
		int i = 9 ; 
		String value = "I like China ";
		//当String类型和任何一个类型相加时，这个加号作为连接符使用，不会做数学运算
		System.out.println(value + i);
		System.out.println(value  +  i  + 5 );
		System.out.println(value  + ( i  + 5 ));
	}
}
