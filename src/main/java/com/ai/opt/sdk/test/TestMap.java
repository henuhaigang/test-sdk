package com.ai.opt.sdk.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	map.put("1", "1");
	map.put("1", "2");
	System.out.println(map.size());
	for(Entry entry:map.entrySet()){
		System.out.println(entry.getValue());
	}
}
}
