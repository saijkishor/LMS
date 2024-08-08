package com.example.demo.controller;

//package com.example.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/index")
    public String index() {
        return "index"; // This refers to index.jsp
    }
}
