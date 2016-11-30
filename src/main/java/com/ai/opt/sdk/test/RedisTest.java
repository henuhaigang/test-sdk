package com.ai.opt.sdk.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;

public class RedisTest {
public static void main(String[] args) {
	Jedis jedis = new Jedis("192.168.0.10");
	jedis.set("foo", "bar1");
	String value = jedis.get("foo");
	System.out.println(value);
	jedis.hset("gao", "ganag", "shigedahaoren,shige jishu niu ren");
	jedis.hset("gao", "ganag1", "shigedahaoren,shige jishu niu ren0");
	Map<String,String> dget=jedis.hgetAll("gao");
	System.out.println(JSON.toJSONString(dget));
	System.out.println(jedis.hget("gao", "ganag"));
	
	
	
	//map测试
	 Map<String,String> user =  new HashMap<String,String>();
     user.put("name", "cd");
     user.put("password", "123456");
     //map存入redis
     jedis.hmset("user", user);
     //mapkey个数
     System.out.println(String.format("len:%d", jedis.hlen("user")));
     //map中的所有键值
     System.out.println(String.format("keys: %s", jedis.hkeys("user") ));
     //map中的所有value
     System.out.println(String.format("values: %s", jedis.hvals("user") ));
     //取出map中的name字段值
     List<String> rsmap = jedis.hmget("user", "name","password");
     System.out.println(rsmap);
     //删除map中的某一个键值 password
     jedis.hdel("user", "password");
     System.out.println(jedis.hmget("user", "name", "password"));
     
     
     System.out.println("---------------------------");
   //list
     jedis.del("listDemo");
     System.out.println(jedis.lrange("listDemo", 0, -1));
     jedis.lpush("listDemo", "A");
     jedis.lpush("listDemo", "B");
     jedis.lpush("listDemo", "C");
     System.out.println(jedis.lrange("listDemo", 0, -1));
     System.out.println(jedis.lrange("listDemo", 0, 1));
     
     //set
     jedis.sadd("sname", "wobby");
     jedis.sadd("sname", "kings");
     jedis.sadd("sname", "demon");
     System.out.println(String.format("set num: %d", jedis.scard("sname")));
     System.out.println(String.format("all members: %s", jedis.smembers("sname")));
     System.out.println(String.format("is member: %B", jedis.sismember("sname", "wobby")));
     System.out.println(String.format("rand member: %s", jedis.srandmember("sname")));
     //删除一个对象
     jedis.srem("sname", "demon");
     System.out.println(String.format("all members: %s", jedis.smembers("sname")));        
     
     
     
     
}
}
