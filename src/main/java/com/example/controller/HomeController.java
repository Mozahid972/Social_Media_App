package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String homeControllerHandler(){
        return "This is home Controller";
    }


    @GetMapping("/home1")
    public String homeControllerHandler2(){
        return "This is home Controller";
    }
    @GetMapping("/home2")
    public String homeControllerHandler3(){
        return "This is home Controller";
    }
    //@PutMapping
//@PostMapping
//	@DeleteMapping


}







