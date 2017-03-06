package com.ai.opt.sdk.test;
public class MutliThreadDemo2 {
    public static void main(String [] args){
        MutliThread1 m1=new MutliThread1("Window 1");
        MutliThread1 m2=new MutliThread1("Window 2");
        MutliThread1 m3=new MutliThread1("Window 3");
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        Thread t3=new Thread(m3);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MutliThread1 implements Runnable{
    private int ticket=100;//每个线程都拥有100张票
    private String name;
    MutliThread1(String name){
        this.name=name;
    }
    public void run(){
        while(ticket>0){
            System.out.println(ticket--+" is saled by "+name);
        }
    }
}