package com.practicah.HelloSpring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class vistas {
    @GetMapping("/")
    public String index() {
        return "HelloWorld";
    }
        
}
