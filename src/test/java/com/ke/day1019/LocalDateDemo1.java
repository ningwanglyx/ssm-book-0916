package com.ke.day1019;

import org.apache.tools.ant.types.resources.FileResourceIterator;
import org.junit.Test;

import javax.swing.*;
import java.time.*;
import java.util.Set;

/**
 * @Author: YangxingLiu
 * @Description: 日期和时间api
 * @Date: Created in 2019/10/19 23:55
 * @Modified By:
 */
public class LocalDateDemo1 {
    @Test
    public void test1(){
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        String time = ld.toString();
        System.out.println(time);
        System.out.println(time.equals(ld));
    }

    //localdate的方法of()/plusXxx()/minusXxx()/withYear()/
    @Test
    public void test2(){
        LocalDate ld2 = LocalDate.of(2019, 9, 8);
        System.out.println(ld2.toString());
        LocalDate ld3 = ld2.plusMonths(2);
        System.out.println(ld3);
        LocalDate ld4 = ld2.minusDays(2);
        System.out.println(ld4);
        LocalDate ld5 = ld2.withYear(2018);
        System.out.println(ld5);

        LocalDate ld6 = ld2.withYear(2017).plusDays(10).minusMonths(3); //链式运算
        System.out.println(ld6);

        System.out.println(ld2.plus(Period.ofYears(3)));
    }

    @Test
    public void test3(){
        Set<String> time = ZoneId.getAvailableZoneIds();
        //System.out.println(time);

        System.out.println(ZonedDateTime.now());
    }

    @Test
    public void test4(){
        LocalDate toDay = LocalDate.now();
        LocalDate birthday = LocalDate.of(1994, 7, 25);
        birthday = LocalDate.of(1994, Month.JUNE, 22);
        System.out.println(birthday);
        System.out.println(Month.JULY);
        DayOfWeek dow = birthday.getDayOfWeek();
        System.out.println(dow);
        System.out.println(dow.getValue());

    }

    @Test
    public void test5(){
        LocalDate programerDay = LocalDate.of(2019, 1, 1).plusDays(255);
        System.out.println(programerDay);
    }
}
