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
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBookById(Integer id) {
        return this.bookMapper.queryBookById(id);
    }

    @Override
    public List<Book> getBookList(int start, int pageNum) {
        List<Book> list = this.bookMapper.queryBookList(start, pageNum);
        return list;
    }

    @Override
    public int addBook(Book book) {
        int num = this.bookMapper.addBook(book);
        return num;
    }

    @Override
    public int updateBook(Book book) {
        int num = this.bookMapper.updateBook(book);
        return num;
    }

    @Override
    public int deleteBookById(Integer id) {
        int num = this.bookMapper.deleteBookById(id);
        return num;
    }
}
