package com.springboot.starter.controller;

import com.springboot.starter.Book;
import com.springboot.starter.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @Autowired                                                              //---------------------wtsrzykniecie przez pole bez konstruktora
    BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
//        return Arrays.asList(
//                new Book("Harry Portier","Roling int the deep", 1969),
//                new Book("Gra o tron","Gruby Gosc", 1970),
//                new Book("Igrzyska","McConnel", 2000),
//                new Book("Ostatni smok","Knaak", 2012)
//        );
        return  bookService.getAllBooks();                                  //----------------------zmiana sposobu wypisanie ksiazek
    }
}
