package com.ai.opt.sdk.test.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Hacker implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {


		System.out.println("hacker代理开始。。。。。。。。");
		
		proxy.invokeSuper(obj, args);
		
		System.out.println("hacker代理结束。。。。。。。。");
		
		return null;
	}



	
	

}
