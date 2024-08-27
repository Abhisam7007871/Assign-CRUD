package com.CRUD_API.Assign.CRUD.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ApplicationController {

    @RequestMapping("/home")
    public String home(){
        return " Welcome Home, NEU";
    }


}
