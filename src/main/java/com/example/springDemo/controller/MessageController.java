package com.example.springDemo.controller;

import com.example.springDemo.data.entities.Message;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
//@RequestMapping("/messages/")
@RequestMapping("/api/messages/")
public class MessageController {
    private List<String> messages = new ArrayList<>();

/*    @PostConstruct
    public void initMessages() {
        messages.add("Hello World");
        messages.add("Today is fantastic!");
    }*/

    @GetMapping
    public List<String> getMessages() {
        return List.of("Hello World!",
        ("Today is fantastic!"));
    }
}