package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.BadriBook;
import com.example.day14ce2.service.BadriBookService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class BadriBookController {
    @Autowired
    BadriBookService bookService;

    @PostMapping("/api/book")
    public BadriBook addBook(@RequestBody BadriBook book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public BadriBook updateBook(@PathVariable int id,@RequestBody BadriBook book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<BadriBook> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<BadriBook> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
