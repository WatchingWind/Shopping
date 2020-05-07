package com.shop.portal.redis;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisTokenKey {
    private String token;
    private int tokenExpiredTime;
}
