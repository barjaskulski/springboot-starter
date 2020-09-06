package com.springboot.starter;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service                                                //--------- rozszerzenei funkcji komponentu
public class BookService {
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book("Harry Portier","Roling int the deep", 1969));
        books.add(new Book("Gra o tron","Gruby Gosc", 1970));
        books.add(new Book("Igrzyska","McConnel", 2000));
        books.add(new Book("Ostatni smok","Knaak", 2012));
    }

    public List<Book> getAllBooks(){
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }
}