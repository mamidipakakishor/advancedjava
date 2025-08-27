package com.example.gradledemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    // GET
    @GetMapping("/hello")
    public String getHello() {
        return "GET: Hello from Spring Boot!";
    }

    // POST
    @PostMapping("/hello")
    public String postHello(@RequestBody String message) {
        return "POST: You sent - " + message;
    }

    // PUT
    @PutMapping("/hello")
    public String putHello(@RequestBody String message) {
        return "PUT: Updated message to - " + message;
    }

    // DELETE
    @DeleteMapping("/hello")
    public String deleteHello() {
        return "DELETE: Resource deleted!";
    }
}