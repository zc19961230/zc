package org.soft.javabase.demo02.arithmetic;

public class Demo07 {

	public static void main(String[] args) {
		int age = 19;
		/*当第一表达式为true时，执行第二表达式，否则执行第三表达式，结果都会赋值给value*/
		String value = age > 18 ? "Lady" : "Girl" ;
		System.out.println(value);
	}
}
