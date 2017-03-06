package com.ai.opt.sdk.test;
public class MutliThreadDemo3 {
    public static void main(String [] args){
        MutliThread3 m=new MutliThread3();
        Thread t1=new Thread(m,"Window 1");
        Thread t2=new Thread(m,"Window 2");
        Thread t3=new Thread(m,"Window 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class MutliThread3 implements Runnable{
    private int ticket=100;//每个线程都拥有100张票
    public void run(){
        while(ticket>0){
            System.out.println(ticket--+" is saled by "+Thread.currentThread().getName());
        }
    }
}