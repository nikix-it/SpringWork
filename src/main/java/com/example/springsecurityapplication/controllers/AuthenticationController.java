package com.example.springsecurityapplication.controllers;

import com.example.springsecurityapplication.models.Product;
import com.example.springsecurityapplication.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AuthenticationController {

    //private final CategoryRepository categoryRepository;

    //public AuthenticationController(CategoryRepository categoryRepository) {
       // this.categoryRepository = categoryRepository;
   // }

    @GetMapping("/authentication")
    public String login(){
        return "authentication";
    }



}
