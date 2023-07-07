package com.cx.dragonnest.Config;

import com.google.common.cache.CacheBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author chenxin
 * @date 2023/07/06 14:46
 */
@EnableCaching
@Configuration
public class GuavaCacheConfig {
	/**
	 * @Cacheable       在方法执行前 Spring 先查看缓存中是否有数据若有，则直接返回缓存数据;若无数据，调用方法将方法返回值放入缓存中
	 * @CachePut        无论怎样，都会将方法的返回值放到缓存中。
	 * @CacheEvict      将一条或多条数据从缓存中删除
	 * @Caching         可以通过 @Caching 注解组合多个注解策略在个方法上
	 *
	 */
	@Bean
	public CacheManager cacheManager() {
		/**
		 * ConcurrentMapCacheManager        使用 ConcurrentMap 来存储缓存
		 * GuavaCacheManager         使用 Google Guava 的 GuavaCache 作为缓存技术
		 * EhCacheCacheManager        使用 EhCache 作为缓存技术
		 */
		GuavaCacheManager cacheManager = new GuavaCacheManager();
		cacheManager.setCacheBuilder(
				CacheBuilder.newBuilder().
						expireAfterWrite(3, TimeUnit.MINUTES));
		return cacheManager;
	}
}
