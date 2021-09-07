package com.ke.service;

import com.ke.model.Book;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description: 定义对book操作的接口方法
 * @Date: Created in 2019/9/9 23:28
 * @Modified By:
 */
public interface IBookService {
    Book getBookById(Integer bookId);
    List<Book> getBookList(int offset, int limit);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(Integer id);
    List<String> getBookName();


}
