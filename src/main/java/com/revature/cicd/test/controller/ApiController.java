package com.revature.cicd.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/get")
    public String handleGetRequest() {
        return "This is a GET request!";
    }

    @PostMapping("/post")
    public String handlePostRequest() {
        return "This is a POST request!";
    }

    @PutMapping("/put")
    public String handlePutRequest() {
        return "This is a PUT request!";
    }

    @DeleteMapping("/delete")
    public String handleDeleteRequest() {
        return "This is a DELETE request!";
    } 
}
