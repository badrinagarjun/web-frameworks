package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.BadriAuthor;
import com.example.q1.model.BadriBook;
import com.example.q1.repository.BadriAuthorRepository;
import com.example.q1.repository.BadriBookRepository;

@Service
public class BookService {
    @Autowired
    private BadriBookRepository bookRepository;
@Autowired
private BadriAuthorRepository authorRepository;
    public BadriBook saveBook(Long authorId, BadriBook book) {
        BadriAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public BadriBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

