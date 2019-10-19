package com.ke.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: YangxingLiu
 * @Description: 第18章代码
 * @Date: Created in 2019/10/8 23:47
 * @Modified By:
 */
public class RedisDemo18 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        RedisTemplate redisTemplate = (RedisTemplate) context.getBean("redisTemplate2");
        //redis存值
        redisTemplate.opsForValue().set("key_1", "liu yangxing");
        redisTemplate.opsForValue().set("key_2", "li yunwei");
        //get value by key
        String value_1 = (String) redisTemplate.opsForValue().get("key_1");
        System.out.println(value_1);
        //通过key删除值
        redisTemplate.delete("key_1");
        //求长度
        Long length = redisTemplate.opsForValue().size("key_2");
        System.out.println(length);
        //设置新值并返回旧值
        String oldValue2 = (String) redisTemplate.opsForValue().getAndSet("key_2", "new value2");
        System.out.println(oldValue2);
        //通过key获取值
        String value_2 = (String) redisTemplate.opsForValue().get("key_2");
        System.out.println(value_2);
        //求子串
        String rangeValue_2 = redisTemplate.opsForValue().get("key_2", 3, 5);
        //追加字符串到末尾，返回新串长度
        int newLen = redisTemplate.opsForValue().append("key_2", "_app");
        System.out.println(newLen);
        System.out.println(redisTemplate.opsForValue().get("key_2"));
    }
}
