package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.BadriUser;
import com.example.springapp.service.BadriUserService;

@RestController
@RequestMapping("/api")
public class BAdriUserController {
    
    @Autowired
    private BadriUserService userService;

    @PostMapping("/user")
    public ResponseEntity<BadriUser> post(@RequestBody BadriUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<BadriUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<BadriUser> getById(@PathVariable int userId)
    {
        BadriUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<BadriUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<BadriUser> getByUserName(@PathVariable String userName)
    {
        BadriUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<BadriUser>(user, HttpStatus.OK);
        }
    }
}
