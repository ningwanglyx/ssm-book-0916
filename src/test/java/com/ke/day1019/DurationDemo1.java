package com.ke.day1019;



import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 15:17
 * @Modified By:
 */
public class DurationDemo1 {
    @Test
    public void test1(){
        Duration duration = Duration.between(Instant.now(), Instant.now().minusSeconds(3000l));
        System.out.println(duration);
    }
}

