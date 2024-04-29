package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.BadriAuthor;
import com.example.q1.repository.BadriAuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private BadriAuthorRepository authorRepository;

    public BadriAuthor saveAuthor(BadriAuthor author) {
        return authorRepository.save(author);
    }

    public BadriAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<BadriAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public BadriAuthor updateAuthor(Long id, BadriAuthor author) {
        BadriAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
