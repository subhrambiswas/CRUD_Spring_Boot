package com.example.crudspringboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    public class BooksController
    {
        @Autowired

        BookService booksService;


        @GetMapping("/book")
        ResponseEntity<List<Books>> getAllBooks()
        {
            HttpHeaders headers = new HttpHeaders();
            headers.add("Book-Header", "BookInfoApi");
            return new ResponseEntity<>( booksService.getAllBooks(), headers, HttpStatus.OK);
        }

//        @GetMapping("/book")//        private List<Books> getAllBooks()
//        {
//            return booksService.getAllBooks();
//        }

        @GetMapping("/books/books-query-based-on-conditions")
        private List<Books> booksQueryBasedOnConditions(){
            return booksService.getBooksBasedOnCondition();

        }

        @GetMapping("/books/books-price")
        private List<Integer> getPriceBooks(){
            return booksService.getBooksAbove1000();

        }

        @GetMapping("/books/books-price-aggregations")
        private int getPriceBooksAggregations(){
            return booksService.getBooksPriceAggregations();

        }

        @GetMapping("/book/{bookid}")
        private Books getBooks(@PathVariable("bookid") int bookid)
        {
            return booksService.getBooksById(bookid);
        }


        //creating a delete mapping that deletes a specified book
        @DeleteMapping("/book/{bookid}")
        private void deleteBook(@PathVariable("bookid") int bookid)
        {
            booksService.delete(bookid);
        }


        //creating post mapping that post the book detail in the database
        @PostMapping("/books")
        private  void saveBook(@RequestBody Books books)
        {
//            booksService.saveOrUpdate(books);
//            return books.getBookId();
            booksService.saveOrUpdate(books);
        }


        //creating put mapping that updates the book detail
        @PutMapping("/books")
        private Books update(@RequestBody Books books)
        {
            booksService.saveOrUpdate(books);
            return books;
        }

    }
