package com.ke.day1019;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 18:00
 * @Modified By:
 */
public class DateTimeFormatterDemo1 {
    @Test
    public void test1(){
        String str = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(2019, 10, 03));
        System.out.println(str);

        String str2 = DateTimeFormatter.BASIC_ISO_DATE.format(LocalDate.of(2019, 10, 03));
        System.out.println(str2);
    }

    @Test
    public void test2(){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        String str = formatter.format(ZonedDateTime.now());
        System.out.println(str);
    }

    @Test
    public void test3(){
        LocalDate churchsBirthday = LocalDate.parse("1999-06-14");
        System.out.println(churchsBirthday);
    }

    @Test
    public void test4(){
        ZonedDateTime launchTime = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0, ZoneId.of("America/New_York"));
        LocalDateTime localDateTime = LocalDateTime.of(1999, 9, 12, 3, 34, 45);
        String str = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(launchTime);
        System.out.println(str);

        String str2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime);

        System.out.println(str2);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTimeFormatter.format(launchTime));
    }

    @Test
    public void test5(){
        ZonedDateTime launchTime = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0, ZoneId.of("America/New_York"));
        LocalDateTime localDateTime = LocalDateTime.of(1999, 9, 12, 3, 34, 45);
        DateTimeFormatter formatterOne = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String formattedTime  = formatterOne.format(launchTime);
        System.out.println(formattedTime);
    }

    @Test
    public void test6(){
        Date date = new Date();
        Date d1 = Date.from(Instant.now());
        System.out.println(d1);
    }
}
