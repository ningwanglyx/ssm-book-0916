package com.ke.service;

import com.ke.mapper.BookMapper;
import com.ke.model.Book;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
public class BookService implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book getBookById(Integer id) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper2 = sqlSession.getMapper(BookMapper.class);
        return bookMapper2.queryBookById(id);
        //return this.bookMapper.queryBookById(id);
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

    @Override
    public List<String> getBookName() {
        List<String> list = bookMapper.getNameList();
        System.out.println(list.size());
        return list;
    }
}
