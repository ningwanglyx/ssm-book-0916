package com.ke.day1019;

import org.junit.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 17:54
 * @Modified By:
 */
public class ZonedDateTimeDemo1 {
    @Test
    public void test1(){
        ZonedDateTime apollollLanchTime = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0, ZoneId.of("America/New_York"));
        System.out.println(apollollLanchTime);

        Instant instant = apollollLanchTime.toInstant();
        System.out.println("instant: " + instant);


    }
}
