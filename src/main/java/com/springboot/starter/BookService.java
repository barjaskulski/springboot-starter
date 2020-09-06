package com.springboot.starter;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service                                                //--------- rozszerzenei funkcji komponentu
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(1,"Harry Portier","Roling int the deep", 1969));
        books.add(new Book(2,"Gra o tron","Gruby Gosc", 1970));
        books.add(new Book(3,"Igrzyska","McConnel", 2000));
        books.add(new Book(4,"Ostatni smok","Knaak", 2012));
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookById(int id){
        return books.stream().filter(book -> book.getId()==id).findFirst().orElseThrow(()->new NoSuchElementException("No book with id:"+id));
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(int id){
        Book foundBook = getBookById(id);
        books.remove(foundBook);
//---------------------------------------------------option with stream
//        getBookById(id);
//        books=books.stream().filter(book -> book.getId()!=id).collect(Collectors.toList());
    }
}
