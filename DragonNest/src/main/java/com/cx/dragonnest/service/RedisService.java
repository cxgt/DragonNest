package com.cx.dragonnest.service;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author chenxin
 * @date 2023/08/16 10:21
 */
@Service
public class RedisService {
	@Autowired
	private StringRedisTemplate redisTemplateJedis;

	/**
	 * PostConstruct在构造函数之后，init()方法之前执行。
	 */
	@PostConstruct
	public void redisTestWithPostConstruct() {
		System.out.println("--------------------redis中String(字符串)测试开始--------------------");
		stringRedis();
		System.out.println("--------------------redis中String(字符串)测试结束--------------------");
		System.out.println();
		System.out.println("--------------------redis中list(列表)测试开始--------------------");
		listRedis();
		System.out.println("--------------------redis中list(列表)测试List结束--------------------");
		System.out.println();
		System.out.println("--------------------redis中Hash(散列)开始--------------------");
		hashRedis();
		System.out.println("--------------------redis中Hash(散列)结束--------------------");
	}


	private void stringRedis() {
		// 定义一个json对象
		JSONObject json = new JSONObject();
		json.put("title", "SpringBoot整合redis(单节点)");
		json.put("author", "Alian");
		json.put("webUrl", "https://blog.csdn.net/Alian_1223");
		json.put("publishTime", LocalDateTime.now());
		//定义也给缓存的key
		String cacheKey = "com.alian.csdn.redis.string";
		// 缓存json字符串,同时设置过期时间为5分钟
		redisTemplateJedis.opsForValue().set(cacheKey, json.toJSONString(), 40, TimeUnit.SECONDS);
		//从缓存中获取到的缓存的值
		String jsonValue = (String) redisTemplateJedis.opsForValue().get(cacheKey);
		System.out.println("[String(字符串)],从缓存中获取到的缓存的值：" + jsonValue);
	}

	private void listRedis() {
		//定义一个List对象
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		list.add("pear");
		List<LocalDateTime> localDateTimes=new ArrayList<>();
		//加入一个java8时间，检测是否序列化
		localDateTimes.add(LocalDateTime.now());
		//定义也给缓存的key
		String cacheKey = "com.alian.csdn.redis.list";
		// 缓存list,同时设置过期时间为30秒(列表的左侧放入)
		redisTemplateJedis.opsForList().leftPushAll(cacheKey, list);
		redisTemplateJedis.expire(cacheKey, 3, TimeUnit.MINUTES);
		//从缓存中获取到的缓存的值
		List<String> value = redisTemplateJedis.opsForList().range(cacheKey, 0, -1);
		System.out.println("[list(列表)],从缓存中获取到的缓存的值：" + value);
	}

	private void hashRedis() {
		//定义一个map对象
		Map<String, Object> map = new HashMap<>();
		map.put("name", "梁南生");
		map.put("sex", "男");
		map.put("salary", "120000");
		map.put("birth", LocalDate.of(1995, 8, 12));
		//定义也给缓存的key
		String cacheKey = "com.alian.csdn.redis.hash";
		// 缓存map,同时设置过期时间为2小时
		redisTemplateJedis.opsForHash().putAll(cacheKey, map);
		redisTemplateJedis.expire(cacheKey, 2, TimeUnit.HOURS);
		//从缓存中获取姓名和生日
		List<Object> list = redisTemplateJedis.opsForHash().multiGet(cacheKey, Arrays.asList("name", "birth"));
		System.out.println("[Hash(散列)],从缓存中获取到的姓名和生日为：" + list);
	}
}
