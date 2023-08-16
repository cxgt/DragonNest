package com.example.dragonnestredis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author chenxin
 * @date 2023/08/16 11:21
 */
@Component
public class JedisUtils {
	@Autowired
	private JedisPool jedisPool;

	/**
	 * 获取Jedis资源
	 */
	public Jedis getJedis(){
		return jedisPool.getResource();
	}
	/**
	 * 释放Jedis连接
	 */
	public void close(Jedis jedis){
		if(jedis!=null){
			jedis.close();
		}
	}
}
