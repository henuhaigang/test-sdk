package com.ai.opt.sdk.test;

import com.ai.opt.sdk.util.DateUtil;

public class TestTry {

	public static void main(String[] args) {
		System.out.println(DateUtil.getCurrentTimeMillis());
		
			 Float[] mf=new  Float[10000];
		    for(int i = 0; i < 10000; i++) {
		    	try {
		        String myString = "123";
		        float myNum = Float.parseFloat(myString);
		        mf[i] = myNum;
		        // int a= i/0;
		    	} catch (Exception ex) {
				    System.out.println("cuowu");
				}
		    }
		
		    System.out.println(DateUtil.getCurrentTimeMillis());
	}
}
