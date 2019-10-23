package com.ke.day1019;

import java.time.Duration;
import java.time.Instant;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/19 22:13
 * @Modified By:
 */
public class InstantDemo1 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration duration = Duration.between(end, start);
        System.out.println(duration);
        Long mills = duration.toMillis();
        System.out.println(mills);

    }
}
