package com.ai.opt.sdk.test;

import java.util.ArrayList;
import java.util.List;

public class TestFindInex {
	List<Integer> findIndex1(int[] arr) 
	 { 
	  List<Integer> list=new ArrayList<Integer>();
	  int len=arr.length;
	     int sum = 0; 
	     for(int i = 0; i < len; i++){
	       sum += arr[i]; 
	     }
	         
	   
	     int leftSum = 0; 
	   
	     for(int i = 0; i <len; i++) 
	     { 
	         sum -= arr[i]; 
	   
	         if(leftSum == sum) 
	            // return i; 
	          list.add(i);
	   
	         leftSum += arr[i]; 
	     } 
	   
	     return list; //list 为空表示没有找到
	 }
	public static void main(String[] args) {
		
	}
}
