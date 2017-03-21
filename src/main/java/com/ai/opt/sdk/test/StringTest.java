package com.ai.opt.sdk.test;

public class StringTest {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		String s3="ab"+"c";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		String str4=new String("abc");
		
		String str5=new String("abc");
		System.out.println(str4==str5);
		System.out.println(s1==str5);
		System.out.println(s1.equals(str5));
		StringBuffer sb=new StringBuffer();
		
		System.out.println(5&6);     //按位与
		System.out.println(5|6);     //按位或
		System.out.println(5^6);     //按位异或
		/*System.out.println(5&&6);  语法错误
		System.out.println(5||6);*/

	}

}
