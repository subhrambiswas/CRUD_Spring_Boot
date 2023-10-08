package com.example.crudspringboot;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

//defining the business logic
@Service
public class BookService
{
    BooksRepository booksRepository;
    //getting all books record by using the method findAll() of CrudRepository

    private static final List<Books> books = new ArrayList<>();
    static {
        books.add(new Books(1, "Mid Summer Night Dream",  "Adam",1000));
        books.add(new Books(2,"As You Like It","EVE",2000));
        books.add(new Books(3,"GoodFood","Tolstoy",300));
        books.add(new Books(4, "Fundamental C",  "Adam",10000));
        books.add(new Books(5," Java Fundamental","EVE",2500));
        books.add(new Books(6,"Good code","Tolstoy",3000));

    }
    public List<Books> getAllBooks()
    {
/*
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(books::add);
*/
        return books;
    }


    public List<Integer> getBooksAbove1000() {

        //return books.stream().filter(i -> i.getPrice() >= 1000).collect(Collectors.toList());


        //Find the length of all book name
        return books.stream().map(i -> i.getBookName().length()).collect(Collectors.toList());

    }

    public int getBooksPriceAggregations() {

        //Sum of books price
//        Integer lengthwise = books.stream().collect(Collectors.summingInt(i -> i.getPrice()));
//        return lengthwise;

      return books.stream().mapToInt(Books::getPrice).sum();



    }

    public List<Books>  getBooksBasedOnCondition() {

        //Find second-highest price after sort in descending order
//           List<Books> bookPrice = books.stream()
//                                        .sorted(Comparator.comparingInt(Books::getPrice).reversed())
//                                        .collect(Collectors.toList());
//           return bookPrice.get(0);


        //Find the first element from the list
//          Optional<Books> bookPrice = books.stream().findFirst();
//          return bookPrice.get();

        //Fetching books on selective conditions on price and author
        return books.stream().filter(i -> i.getAuthor().equalsIgnoreCase("Adam")).collect(Collectors.toList());

    }

    public Books getBooksById(int id)
    {
        return booksRepository.findById(id).get();
    }



    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Books book)
    {
        //Using repository and JPA integration
//        booksRepository.save(books);

        books.add(book);


    }


    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        booksRepository.deleteById(id);
    }

    //updating a record
    public void update(Books books)
    {
        booksRepository.save(books);
    }

}