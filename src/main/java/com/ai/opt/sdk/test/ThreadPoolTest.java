package com.ai.opt.sdk.test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class ThreadPoolTest {
	
	static int findIndex(int[] arr)  
	{  
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
	            return i;  
	  
	        leftSum += arr[i];  
	    }  
	  
	    return -1;  //-1表示没有找到
	}
static List<Integer> findIndex1(int[] arr)  
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
	  
	    return list;  //list 为空表示没有找到
	}
	
	
	
	public static void main(String[] args) {
		//ThreadPoolExecutor
		//HashMap
	  ConcurrentHashMap hm=new ConcurrentHashMap<>();
	  hm.put(null, 0);
	  
	  Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	  
	 // ht.put(null, 1);
	  
	  
	  
	  //ThreadPool pool=newInteger
		
		int[] arr={1,3,1,2,2};
		/*for(int i=0;i<arr.length;i++){
			if(i==0){
				
			}
		}*/
		for(Integer i:findIndex1(arr)){
			System.out.println(i);
		}
		System.out.println(1<<2);
		
		
		System.out.println(1>>2);
		//System.out.println(findIndex1(arr));
	}
}
