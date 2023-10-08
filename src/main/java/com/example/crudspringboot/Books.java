package com.example.crudspringboot;


import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table
public class Books {
    //Defining book id as primary key
    @Id
    @Column
    private int bookId;
    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private int price;

    public Books(int bookId, String bookname, String author, int price) {

        this.bookName = bookname;
        this.bookId = bookId;
        this.author = author;
        this.price = price;
    }


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books [bookId=" + bookId + ", " + "bookName=" + bookName + ", " + "author=" + author + ", " + "price=" + price + "]";
    }
}