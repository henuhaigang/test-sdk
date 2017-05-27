package com.ai.opt.sdk.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDymic implements InvocationHandler{

	private Subject sub;
	
	public ProxyDymic(Subject sub){
		this.sub=sub;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("------开始代理---------");
		Object result=method.invoke(sub, args);
		
		System.out.println("------代理结束---------");
		
		return result;
	}

}
