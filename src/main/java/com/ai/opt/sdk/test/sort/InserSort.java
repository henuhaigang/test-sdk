package com.ai.opt.sdk.test.sort;

public class InserSort {

	public  int[] sort(int[] arr){
		
		int len=arr.length;
		int j=0;
		for(int i=0;i<len;i++){
		   j=i+1;
		   int temp;
		   if(arr[j]<arr[i]){
			   temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
			
		   }
		   
			
		}
		return null;
	}
}
