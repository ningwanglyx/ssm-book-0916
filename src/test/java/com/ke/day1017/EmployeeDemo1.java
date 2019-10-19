package com.ke.day1017;

import org.junit.jupiter.api.Test;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/17 23:21
 * @Modified By:
 */
public class EmployeeDemo1 {
    @Test
    public void test1() throws CloneNotSupportedException {
        Employee e1 = new Employee("liu yangxing", 3000);
        Employee e2 = e1;
        e2.setSalary(5000);
        System.out.println(e1.toString());

        Employee e3= e1.clone();

        e3.setSalary(6000);
        System.out.println(e3.toString());
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
