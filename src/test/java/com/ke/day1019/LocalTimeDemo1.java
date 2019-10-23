package com.ke.day1019;

import org.junit.Test;

import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 17:41
 * @Modified By:
 */
public class LocalTimeDemo1 {
    @Test
    public void test1(){
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(16, 30, 34);
        LocalTime old = lt.plus(Period.ofDays(0));
        System.out.println(old);
        System.out.println(lt2);
        LocalTime newTime = lt2.plusHours(3);
        System.out.println(newTime);
    }

    @Test
    public void test2(){
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }

}
