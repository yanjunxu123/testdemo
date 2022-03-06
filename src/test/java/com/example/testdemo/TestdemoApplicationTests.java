package com.example.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class TestdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void RedisTemplateTest() {

        String key = "testTemplate:1";

        this.redisTemplate.opsForValue().set(key, "testTemplatevalue1", 1000L, TimeUnit.MILLISECONDS);

        String value = (String) this.redisTemplate.opsForValue().get(key);

        System.out.println("master的更改");
        System.out.println("第一行");
    }
}
