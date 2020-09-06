package com.springboot.starter.controller;

import com.springboot.starter.Book;
import com.springboot.starter.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class BookController {
    @Autowired                                                              //---------------------wtsrzykniecie przez pole bez konstruktora
    BookService bookService;

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable int id){              //----------------------@PathVariable oznacza typ parametru przekazanego w "{}"
        //try{
            return ResponseEntity.ok(bookService.getBookById(id));          //----------------------ResponseEntity do obslugi bledow http
        //}catch (NoSuchElementException exception){
        //     return ResponseEntity.notFound().build();                       //---------------------- OBSLUGA BLEDU
        //}
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable int id){
        //try{
            bookService.deleteBook(id);
            return ResponseEntity.ok().build();
        //} catch (NoSuchElementException exception){
        //    return ResponseEntity.notFound().build();
        //}
    }

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

    @PostMapping("/books")
    public void addBoook(Book book){                                        //---------------------- @RequestBody - wymusza JSON
        bookService.addBook(book);
    }
}
