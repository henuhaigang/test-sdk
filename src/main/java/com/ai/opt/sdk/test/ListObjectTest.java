package com.ai.opt.sdk.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class ListObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=null;
		List<Student> list=new ArrayList<Student>();
		for(int i=0;i<10;i++){
			stu=new Student();
			stu.setName("jack"+i);
			stu.setSex("male"+i);
			list.add(stu);
		}
		System.out.println(JSON.toJSONString(list));

	}

}
