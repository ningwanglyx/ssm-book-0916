package com.ke.day1020;

import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/20 19:13
 * @Modified By:
 */
public class StreamDemo1 {
    @Test
    public void test1(){
        Stream<String> words = Stream.of("aaa", "alice", "bob", "ted");
        /*Optional<String> largest = words.max(String::compareToIgnoreCase);
        System.out.println(largest);
        System.out.println(largest.orElse(""));*/

        Optional<String> startEithB = words.filter(s -> s.startsWith("b")).findFirst();
        System.out.println(startEithB.orElse("don't find"));
    }

    @Test
    public void test2(){
        Stream<String> words = Stream.of("aaa", "alice", "bob", "ted");
        boolean check = words.parallel().anyMatch(s -> s.startsWith("a"));
        System.out.println(check);
    }

    @Test
    public void test3(){
        Iterator<Integer> iter =  Stream.iterate(0, n -> n+1).limit(10).iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        Object[] numbers = Stream.iterate(0, n -> n+1).limit(4).toArray();
        System.out.println("Object array: " + numbers);

        try{
            Integer number = (Integer) numbers[0];
            System.out.println("number: " + number);
            System.out.println("the following statement throws an exeception: ");
            Integer[] numbers2 = (Integer[]) numbers; // 把obejct类型数组转换为integer类型数组
        } catch (ClassCastException ex){
            System.out.println(ex);
        }

        Integer[] numbers3 = Stream.iterate(0, n -> n+1).limit(10).toArray(Integer[]::new);
        System.out.println("Integer array: " + numbers3);

    }

    public static Stream<String> noVowels(){
        List<String> list = Arrays.asList("hello", "java", "love", "world");
        Stream<String> words = list.stream();
        Stream res = words.map(s -> s.replaceAll("[aeiouAEIOU]", ""));
        return res;
    }

    public static <T> void show(String label, Set<T> set){
        System.out.println(label + ": " + set.getClass().getName());
        System.out.println("[" + set.stream().limit(2).map(Object::toString).collect(Collectors.joining(",")) + "]");
    }

    @Test
    public void test4(){
        Set<String> noVowelSet = noVowels().collect(Collectors.toSet());
        show("noVowelSet", noVowelSet);
    }
}
