package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/")
    public List<Book> index() {
        Book book1 = new Book();
        book1.id = 123;
        book1.name = "new book1";

        Book book12 = new Book();
        book12.id = 1234;
        book12.name = "new book12";

        ArrayList<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book12);
        return books;
    }
}
