package com.ai.opt.sdk.test;

public class TestException {


	public String  test(){
		try{
			int a=1/0;
		}catch(Exception e){
			e.printStackTrace();
			return "222";
		}
		String b="11111";
		return b;
	}
	public static void main(String[] args) {
		TestException t=new TestException();
		System.out.println(t.test());
	}
}
