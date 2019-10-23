package com.ke.day1019;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 16:54
 * @Modified By:
 */
public class LocalDateDemo2 {
    @Test
    public void test1(){
        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);

        LocalDate programerDay = LocalDate.of(2018,1,1).plusDays(255);
        System.out.println("programerDay: " + programerDay);

        LocalDate independencyDay = LocalDate.of(2018, Month.NOVEMBER, 1);
        LocalDate christmas = LocalDate.of(2018, Month.DECEMBER, 25);
        System.out.println("until chrismas: " + independencyDay.until(christmas));
        System.out.println(LocalDate.now().until(LocalDate.now().minusDays(3)));
    }

    @Test
    public void test2(){
        System.out.println(LocalDate.of(2019, 1, 31).plusDays(31));
        System.out.println(LocalDate.of(2019, 1, 16).plusMonths(1));
        System.out.println(LocalDate.of(2019, 3, 24).minusMonths(1));
        System.out.println(LocalDate.of(2019, 3, 24).minusDays(28));
        DayOfWeek dayOfWeek = LocalDate.of(1900, 3, 2).getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue());

        DayOfWeek dow = DayOfWeek.MONDAY.plus(3);
        System.out.println(dow);
    }
}
