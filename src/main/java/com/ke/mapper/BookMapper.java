package com.ke.mapper;

import com.ke.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/9 23:27
 * @Modified By:
 */
@Repository
public interface BookMapper {
    Book queryBookById(Integer id);
    List<Book> queryBookList(@Param("offset") int start, @Param("limit") int pageNum);
    int addBook(Book book);
    int updateBook(Book book);
    int deleteBookById(Integer id);
}
