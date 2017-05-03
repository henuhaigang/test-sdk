package com.ai.opt.sdk.test;

public class Child {
public String name="tom";
	
	public Child(){
		super();
		System.out.println("this is child");
		
	}
	public static void main(String[] args) {
		Child p=new Child();
		System.out.println(p.name);
	}
}
