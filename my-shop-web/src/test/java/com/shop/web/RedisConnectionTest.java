package com.shop.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConnectionTest {
    @Autowired
    JedisPool jedisPool;

    @Test
    public void jedisPoolTest() {
        Jedis jedis = null;
        try{
            jedis = jedisPool.getResource();
            jedis.set("yang","yang1");
            System.out.println(jedis.get("yang"));
        } finally {
            if(jedis != null)
            jedis.close();
        }

    }

    @Test
    public void bean() {

    }
}
