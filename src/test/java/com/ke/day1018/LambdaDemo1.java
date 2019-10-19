package com.ke.day1018;

import javafx.scene.input.InputMethodTextRun;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/19 0:07
 * @Modified By:
 */
public class LambdaDemo1 {
    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("nnn");
        list.add(null);
        list.add("ddd");
        /*for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        list.removeIf(e -> e == null);
        for (String s : list) {
            System.out.println(s);
        }*/
        //list.forEach(System.out::println);
        list.forEach(x-> System.out.println(x));
    }
}

