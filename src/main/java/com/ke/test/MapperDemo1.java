package com.ke.test;

import com.ke.mapper.BookMapper;
import com.ke.pojo.Book;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.java2d.pipe.OutlineTextRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/10/29 10:53
 * @Modified By:
 */
public class MapperDemo1 {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        BookMapper bookMapper = context.getBean(BookMapper.class);
        Integer id = 3;
        Book book = bookMapper.queryBookById(id);
        System.out.println(book.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        BookMapper bookMapper = context.getBean(BookMapper.class);
        /*List<Book> list = bookMapper.getBookByIdAndName(6, "ch");
        for (Book book : list) {
            System.out.println(book);
        }*/
        Book book = new Book();
        book.setBookId(3);
        book.setName("CORE JAVA");
        book.setNumber(234567);
        /*List<Book> list = bookMapper.getBookByPojo(book);
        for (Book book1 : list) {
            System.out.println(book1);
        }*/
        int num = bookMapper.updateBookByPojo(book);
        System.out.println(num);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        BookMapper bookMapper = context.getBean(BookMapper.class);
        //批量插入foreach标签
        /*List<Book> list = new ArrayList<>();
        list.add(new Book("liu", 11, "one"));
        list.add(new Book("li", 22, "two"));
        list.add(new Book("liuu", 33, "three"));
        int num = bookMapper.bathInsertBook(list);
        System.out.println(num);*/

        //choose when otherwise标签实现if else default 效果，多个查询条件选一个执行
        Book book = new Book();
        //book.setBookId(2);
        //book.setName("yes");
        Book b = bookMapper.queryBookByIdOrName(book);
        System.out.println(b);
    }
}
