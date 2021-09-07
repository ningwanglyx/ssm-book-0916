package com.ke.model;

/**
 * @Author: YangxingLiu
 * @Description: 对应书籍的pojo对象
 * @Date: Created in 2019/9/9 23:25
 * @Modified By:
 */
public class Book {
    private Integer bookId;
    private String name;
    private Integer number;
    private String detail;
    private Integer itemId;

    public Book(){

    }
    public Book(String name, Integer number, String detail){
        this.name = name;
        this.number = number;
        this.detail = detail;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
