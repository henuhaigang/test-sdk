package com.ai.opt.sdk.components.ccs;

import java.util.Arrays;
import java.util.List;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooDefs.Ids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory; 
public class ZooKeeperOperator extends AbstractZooKeeper {
	
	private static final Logger LOG = LoggerFactory.getLogger(ZooKeeperOperator.class);
	/** 
     *  
     *<b>function:</b>创建持久态的znode,比支持多层创建.比如在创建/parent/child的情况下,无/parent.无法通过 
     *@author cuiran 
     *@createDate 2013-01-16 15:08:38 
     *@param path 
     *@param data 
     *@throws KeeperException 
     *@throws InterruptedException 
     */  
    public void create(String path,byte[] data)throws KeeperException, InterruptedException{  
        /** 
         * 此处采用的是CreateMode是PERSISTENT  表示The znode will not be automatically deleted upon client's disconnect. 
         * EPHEMERAL 表示The znode will be deleted upon the client's disconnect. 
         */   
        this.zooKeeper.create(path, data, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);  
    }  
    /** 
     *  
     *<b>function:</b>获取节点信息 
     *@author cuiran 
     *@createDate 2013-01-16 15:17:22 
     *@param path 
     *@throws KeeperException 
     *@throws InterruptedException 
     */  
    public void getChild(String path) throws KeeperException, InterruptedException{     
        try{  
            List<String> list=this.zooKeeper.getChildren(path, false);  
            if(list.isEmpty()){  
            	System.out.println(path+"中没有节点");  
            	//LOG.error(path+"中没有节点");
            }else{  
            	System.out.println(path+"中存在节点");  
            	//LOG.error(path+"中存在节点");
                for(String child:list){  
                    System.out.println("节点为："+child);  
                 //   LOG.error("节点为："+child);
                }  
            }  
        }catch (KeeperException.NoNodeException e) {  
            // TODO: handle exception  
             throw e;     
  
        }  
    }  
      
    public byte[] getData(String path) throws KeeperException, InterruptedException {     
        return  this.zooKeeper.getData(path, false,null);     
    }    
      
     public static void main(String[] args) {  
    	   /* try {     
        	   ZooKeeperOperator zkoperator             = new ZooKeeperOperator();     
               zkoperator.connect("192.168.0.10");  
                 
              byte[] data = new byte[]{'1','b','c','d'};     
                    
          zkoperator.create("/rt1",data);     
             System.out.println("创建的新的节点为"+Arrays.toString(zkoperator.getData("/rt1")));     
                  
               zkoperator.create("/root/child1",data);     
             System.out.println(Arrays.toString(zkoperator.getData("/root/child1")));     
                  
             zkoperator.create("/root/child2",data);     
             System.out.println(Arrays.toString(zkoperator.getData("/root/child2")));     
                    
               String zktest="ZooKeeper的Java API测试";  
               zkoperator.create("/root/child3", zktest.getBytes());  
               System.out.println("获取设置的信息："+new String(zkoperator.getData("/root/child3")));  
                 
               System.out.println("节点孩子信息:");     
               zkoperator.getChild("/root");  
               
                    
               zkoperator.close();        
                  
                  
            } catch (Exception e) {     
               e.printStackTrace();     
            } */
         CuratorFramework zkTools=CuratorFrameworkFactory

                 .builder()

                 .connectString("192.168.0.10:2181")

                 .connectionTimeoutMs(2000)

                 .retryPolicy(new RetryNTimes(2000,20000))

                 .build();
         zkTools.start();
         
         try {
			/*zkTools.create()//创建一个路径

			 .creatingParentsIfNeeded()//如果指定的节点的父节点不存在，递归创建父节点

			 .withMode(CreateMode.PERSISTENT)//存储类型（临时的还是持久的）

			 .withACL(ZooDefs.Ids.OPEN_ACL_UNSAFE)//访问权限

			 .forPath("/zk121/test/sdfsf/123","gaogang".getBytes());*/
			
			System.out.println(new String(zkTools.getData().forPath("/zk121/test/sdfsf/123"),"utf-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建的路径
    }
}
