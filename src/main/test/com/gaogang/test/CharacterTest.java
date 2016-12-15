package com.gaogang.test;

import com.alibaba.fastjson.JSON;

public class CharacterTest {

	public static void main(String[] args) {
		System.out.println(new String(new char[] {(char) 3 }));
		String str=new String(new char[] {(char) 3 });
		System.out.println(JSON.toJSONString(str));  //输出结果："\u0003"     
	}
}
