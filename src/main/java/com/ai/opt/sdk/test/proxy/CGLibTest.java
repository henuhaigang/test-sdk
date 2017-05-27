package com.ai.opt.sdk.test.proxy;

import net.sf.cglib.proxy.Enhancer;

public class CGLibTest {

	public static void main(String[] args) {
		Programer p=new Programer();
		
		Hacker h=new Hacker();
		
		Enhancer en=new Enhancer();
		
		en.setSuperclass(p.getClass());
		
		en.setCallback(h);
		
		Programer proxy=(Programer)en.create();
		
		proxy.say();
	}
}
