package com.cx.dragonnest.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author chenxin
 * @date 2023/08/16 10:39
 */
@Component
@ConfigurationProperties(prefix = "spring.redis.pool")
@Data
public class JedisConfig implements Serializable {

	private static final long serialVersionUID = 3610310063866082384L;
	private String host;
	private int port;
	private String password;
	private Integer maxTotal;
	private Integer maxIdle;
	private Integer minIdle;
	private Long maxWaitMillis;
	private boolean testOnBorrow;
	private boolean testOnReturn;
	private boolean testWhileIdle;
}
