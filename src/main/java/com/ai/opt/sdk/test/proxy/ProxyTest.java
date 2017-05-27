package com.ai.opt.sdk.test.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 * 
 * @author scorpion
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		// 创建委托对象
		RequestSubject sub = new RequestSubject();
		// 创建调用处理器对象
		ProxyDymic dymic = new ProxyDymic(sub);

		//动态生成代理对象
		Subject subProxy = (Subject) Proxy.newProxyInstance(RequestSubject.class.getClassLoader(),
				RequestSubject.class.getInterfaces(), dymic);
		//通过代理对象调用方法
		subProxy.request();

	}
}
