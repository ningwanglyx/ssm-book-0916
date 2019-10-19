package com.ke.day1017;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/17 23:17
 * @Modified By:
 */
public class Employee implements Cloneable {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
