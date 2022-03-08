package net.javaguides.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springbootbackend.model.User;
import net.javaguides.springbootbackend.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
    
    @Autowired
    private UserRepository UserRepository;

    @GetMapping("users")
    public List < User > getUsers(){
        return this.UserRepository.findAll();
    }
}
