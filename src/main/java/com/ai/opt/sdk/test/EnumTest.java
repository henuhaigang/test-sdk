package com.ai.opt.sdk.test;

enum TestEnum1{
	      A,B,C,D;

	    static int value1;
	    public static int getValue() {
	        return value1;
	    }

	    static String type1;
	    public static String getType() {
	        return type1;
	    }
   
}
public class EnumTest{
	public static void main(String[] args) {
		System.out.println(TestEnum1.getValue());
		System.out.println(TestEnum1.getType());
	}
}
