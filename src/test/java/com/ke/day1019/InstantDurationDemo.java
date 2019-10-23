package com.ke.day1019;

import javax.xml.stream.events.StartDocument;
import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 15:27
 * @Modified By:
 */
public class InstantDurationDemo {
    public static void main(String[] args) {
        Instant start = Instant.now();
        runAlgorithm();
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        long millis = timeElapsed.toMillis();
        System.out.println(millis);
    }

    public static void runAlgorithm(){
        int size = 10;
        List<Integer> list = new Random().ints().map(i -> i%100).limit(size).boxed().collect(Collectors.toList());
        Collections.sort(list);
        System.out.println(list);
    }
}
