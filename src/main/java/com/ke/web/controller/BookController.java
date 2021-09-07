package com.ke.web.controller;

import com.ke.model.Book;
import com.ke.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: YangxingLiu
 * @Description: 图书管理系统的Controller类
 * @Date: Created in 2019/9/9 23:24
 * @Modified By:
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public  String toBookList(Model model){
        List<Book> list = this.bookService.getBookList(0, 100);
        model.addAttribute("list", list);
        for (Book book : list) {
            System.out.println(book);
        }
        return "list";
    }
    @RequestMapping(value="/detail/{bookId}", method = RequestMethod.GET)
    public String detailBook(@PathVariable("bookId") Integer bookId, Model model){
        Book book = this.bookService.getBookById(bookId);
        model.addAttribute("book", book);
        return "detail";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain; charset=UTF-8")
    @ResponseBody
    public String add(Book book){
        Book hasBook = bookService.getBookById(book.getBookId());
        int i = -2;
        if(hasBook == null){
            i = bookService.addBook(book);
        }
        String res = 1>0 ? "success": "error";
        return res;
    }
    @RequestMapping(value = "/del/{bookId}", method=RequestMethod.GET)
    @ResponseBody
    public String deleteBookById(@PathVariable("bookId") Integer id){
        int i = bookService.deleteBookById(id);

        return i>0? "seccess":"error";
    }

}
