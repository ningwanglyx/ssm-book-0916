package com.ke.test;

import com.ke.pojo.Role;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;


/**
 * @Author: YangxingLiu
 * @Description: 第17章代码
 * @Date: Created in 2019/10/8 22:41
 * @Modified By:
 */
public class RedisDemo17 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        RedisTemplate redisTemplate = context.getBean(RedisTemplate.class);
        Role role = new Role();
        role.setId(2L);
        role.setRoleName("teacher");
        role.setNote("the greatest man");
        //
        redisTemplate.opsForValue().set("role_1", role);
        //基于RedisTempalte，基于连接池的操作，不能保证每次使用RedisTemplate是操作同一个对Redis的连接
        Role role_redis = (Role) redisTemplate.opsForValue().get("role_1");
        System.out.println(role_redis.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        RedisTemplate redisTemplate = (RedisTemplate) context.getBean("redisTemplate");
        Role role = new Role();
        role.setId(3L);
        role.setRoleName("singler");
        role.setNote("the greatest man");
        SessionCallback callback = new SessionCallback() {
            @Override
            public Role execute(RedisOperations redisOperations) throws DataAccessException {
                redisOperations.boundValueOps("role_2").set(role);
                return (Role) redisOperations.boundValueOps("role_2").get();
            }
        };
        Role savedRole = (Role) redisTemplate.execute(callback);
        System.out.println(savedRole.toString());
    }
}
