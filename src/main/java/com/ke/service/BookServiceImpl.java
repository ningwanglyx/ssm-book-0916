package com.ke.service;

import com.ke.mapper.BookMapper;
import com.ke.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description: 对book操作方法的实现
 * @Date: Created in 2019/9/9 23:28
 * @Modified By:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBookById(Integer id) {
        return this.bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> getBookList(int offset, int limit) {
        List<Book> list = this.bookMapper.queryBookList(offset, limit);
        return list;
    }

    @Override
    @Transactional
    public int addBook(Book book) {
        int num = this.bookMapper.addBook(book);
        return num;
    }

    @Override
    @Transactional
    public int updateBook(Book book) {
        int num = this.bookMapper.updateBook(book);
        return num;
    }

    @Override
    @Transactional
    public int deleteBookById(Integer bookId) {
        int num = this.bookMapper.deleteBookById(bookId);
        return num;
    }
}
