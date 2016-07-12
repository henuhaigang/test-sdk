package com.ai.opt.sdk.components.mds;

import java.util.Properties;  
import java.util.concurrent.TimeUnit;  
  
import kafka.javaapi.producer.Producer;  
import kafka.producer.KeyedMessage;  
import kafka.producer.ProducerConfig;  

  

/**
 * kafka测试用例
 * @author scorpion
 *
 */
public class kafkaProducer extends Thread {

	//声明topic
	private String topic;
	//构造方法
	 public kafkaProducer(String topic){  
	        super();
	        this.topic = topic;  
	    }
	
	 @Override
	public void run() {
		Producer producer=createProducer();
		int i=0;
		while(true){
			producer.send(new KeyedMessage<Integer, String>(topic,"message:"+i++));
			System.out.println("生产=message:"+i++);
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	 private Producer createProducer(){
		 
		 Properties proterties=new Properties();
		 proterties.put("zookeeper.connect", "192.168.0.10:2181");
	//	 proterties.put("serializer", StringEncoder.class.getName());
		 proterties.put("serializer.class", "kafka.serializer.StringEncoder");
		 proterties.put("key.serializer.class", "kafka.serializer.StringEncoder");
		 proterties.put("producer.type", "sync");
		 //proterties.put("kafka.topic", "test");
		 proterties.put("metadata.broker.list", "192.168.0.10:9092");
		
		 
		 //producer.type=sync
		 return new Producer<Integer,String>(new ProducerConfig(proterties));
	 }
	 
	 public static void main(String[] args) {
		 new kafkaProducer("test").start();// 使用kafka集群中创建好的主题 test 
	}
}
