package com.ai.opt.sdk.test;


public class TestCouponCode {

	static void pong(){
		System.out.println("pong");
	}
	public int add(int a,int b){
		try{
			return a+b;
		}catch(Exception e){
			System.out.println("catch 语句块");
		}finally{
			System.out.println("finally 语句块");
		}
		return 0;
	}
	public static void main(String[] args) {
		/*System.out.println(UUID.randomUUID().toString().hashCode());
		System.out.println(UUID.fromString(UUID.randomUUID().toString()));
		ByteOutputStream bos=new ByteOutputStream();*/
		String s=null;
	/*if(s!=null&s.length()>0){
			
		}*/
		//FileOutputStream fos=new FileOutputStream("");
		//BufferedInputStream bis=new Bu
		/*String s1="programming";
		String s2=new String("programming");
		String s3="program"+"ming";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s1.intern());
		
		
		TestCouponCode tc=new TestCouponCode();
		System.out.println("和是："+tc.add(9, 34));*/
		
		Thread t=new Thread(){
			public void run(){
				pong();
			}
			
		};
		t.start();
		System.out.println("ping");
		
	}
	
}
