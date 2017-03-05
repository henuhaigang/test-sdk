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

	}

}
